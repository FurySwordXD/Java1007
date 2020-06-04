import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Stream;
import java.io.*;

public class FileWalk
{
    public static void getAll(String path)
    {
        //List<String> result = null;
        try (Stream<Path> walk = Files.walk(Paths.get(path))) {

            Object[] paths = walk.filter(Files::isRegularFile).toArray();
            for (int i = 0; i < paths.length; i++)
                System.out.println(paths[i]);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void getFilesInCurrentDirectory(String path)
    {
        File file = new File(path);
        File[] files = file.listFiles();

        for (int i = 0; i < files.length; i++)
            if (files[i].isFile())
                System.out.println(files[i].getName());
    }

    public static void getFoldersInCurrentDirectory(String path)
    {
        File file = new File(path);
        File[] files = file.listFiles();

        for (int i = 0; i < files.length; i++)
            if (files[i].isDirectory())
                System.out.println(files[i].getName());
    }

    public static void getAllFiles(String path)
    {
        //List<String> result = null;
        try (Stream<Path> walk = Files.walk(Paths.get(path))) {

            Object[] paths = walk.filter(Files::isRegularFile).toArray();
            for (int i = 0; i < paths.length; i++)
                System.out.println(paths[i]);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void getAllFolders(String path)
    {
        //List<String> result = null;
        try (Stream<Path> walk = Files.walk(Paths.get(path))) {

            Object[] paths = walk.filter(Files::isDirectory).toArray();
            for (int i = 0; i < paths.length; i++)
                System.out.println(paths[i]);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[])
    {
        FileWalk.getAllFiles("./");
        FileWalk.getAllFolders("./");
        //FileWalk.getFilesInCurrentDirectory("./");
        //FileWalk.getFoldersInCurrentDirectory("./");
    }
}
