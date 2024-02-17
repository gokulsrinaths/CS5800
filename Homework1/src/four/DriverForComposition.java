import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DriverForComposition {

    public static void main(String[] args) {

            String[] appSubFolderNames = new String[]{"config", "controllers", "library", "migrations", "models", "views"};
            List<Folder> appSubFolders = new ArrayList<>();

            //Initialize folder sub folder objects
            Arrays.stream(appSubFolderNames).forEach(folderName -> appSubFolders.add(new Folder(folderName, new ArrayList<>(), new ArrayList<>())));

            //Create app folder and add the sub folders
            Folder app = new Folder("app", new ArrayList<>(), appSubFolders);
            //Create .phalcon folder
            Folder phalcon = new Folder(".phalcon", new ArrayList<>(), new ArrayList<>());
            //Create cache folder
            Folder cache = new Folder("cache", new ArrayList<>(), new ArrayList<>());
            //Create public folder
            Folder publicFolder = new Folder("public", new ArrayList<>(), new ArrayList<>());
            //Create sub folder for source files
            List<Folder> sourceFileSubFolders = new ArrayList<>();
            sourceFileSubFolders.add(phalcon);
            sourceFileSubFolders.add(app);
            sourceFileSubFolders.add(cache);
            sourceFileSubFolders.add(publicFolder);

            //Source file subfiles
            List<File> sourceFileSubFiles = new ArrayList<>();
            sourceFileSubFiles.add(new File(".htaccess"));
            sourceFileSubFiles.add(new File(".htrouter.php"));
            sourceFileSubFiles.add(new File("index.html"));

            //Creates Source Files
            Folder sourceFiles = new Folder("Source Files", sourceFileSubFiles, sourceFileSubFolders);

            //Create Include path
            Folder includePath = new Folder("Include Path" ,new ArrayList<>(), new ArrayList<>());

            //Create remote files
            Folder remoteFiles = new Folder("Remote Files", new ArrayList<>(), new ArrayList<>());

            //Sub folder array list
            List<Folder> php_subFiles = new ArrayList<>();
            php_subFiles.add(sourceFiles);
            php_subFiles.add(includePath);
            php_subFiles.add(remoteFiles);


            //Create php_demo1
            Folder php_demo1 = new Folder("php_demo1", new ArrayList<>(), php_subFiles);

            //Before delete operation
            System.out.println("----------------------------------");
            System.out.println("Before delete operation..");
            php_demo1.print();

            //Deleting app folder
            System.out.println("----------------------------------");
            php_demo1.deleteFolder("php_demo1/Source Files/app");
            System.out.println("After deleting the app folder.. (php_demo1/Source Files/app) ");
            php_demo1.print();


            //Deleting public folder
            System.out.println("----------------------------------");
            php_demo1.deleteFolder("php_demo1/Source Files/public");
            System.out.println("After deleting the public folder.. (php_demo1/Source Files/public) ");
            php_demo1.print();



    }
}