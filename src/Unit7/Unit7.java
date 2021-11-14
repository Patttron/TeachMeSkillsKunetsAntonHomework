package Unit7;

import org.apache.log4j.Logger;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

public class Unit7 {
    private static final String ZIP_FILE_NAME = "E:\\Java\\TeachMeSkills\\TeachMeSkillsKunetsAntonHomework\\src\\file123.zip";
    private static final Logger log = Logger.getLogger(Unit7.class);

    public static void main(String[] args) throws IOException {
        archive(new Player(50, "Messi"));
        extractZip();
    }

    public static byte[] archive(Player player) throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("file.txt"));
        objectOutputStream.writeObject(player);
        objectOutputStream.close();
        try (ZipOutputStream zipStream = new ZipOutputStream(new FileOutputStream(ZIP_FILE_NAME));
             FileInputStream serializedPlayer = new FileInputStream("file.txt")) {
            ZipEntry playerEntry = new ZipEntry("file.txt");
            zipStream.putNextEntry(playerEntry);
            int currentByte;
            while ((currentByte = serializedPlayer.read()) != -1) {
                zipStream.write(currentByte);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        log.info("Object was archived.");
        return Files.readAllBytes(Path.of(ZIP_FILE_NAME));
    }

    public static void extractZip() throws IOException {
        ZipFile zipFile = null;
        InputStream playerStream = null;
        try {
            zipFile = new ZipFile(ZIP_FILE_NAME);
            ZipEntry firstEntry = zipFile.entries().nextElement();
            playerStream = zipFile.getInputStream(firstEntry);
            byte[] serializedPlayer = playerStream.readAllBytes();
            ObjectInputStream playerBytesStream = new ObjectInputStream(new ByteArrayInputStream(serializedPlayer));
            Player player = (Player)playerBytesStream.readObject();
            log.info(player);
        } catch (IOException | ClassNotFoundException e ) {
            log.error("Log extract: ", e);
        }
        finally {
            if(zipFile!= null) {
                zipFile.close();
            }
            if(playerStream != null) {
                playerStream.close();
            }
        }
    }
}
