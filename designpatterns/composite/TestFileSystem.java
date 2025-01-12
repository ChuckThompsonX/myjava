package myjava.designpatterns.composite;

public class TestFileSystem {
    
    public static void main(String... args) {
        
        AFile file1 = new AFile();
        AFile file2 = new AFile();
        AFile file3 = new AFile();
        AFile file4 = new AFile();
        
        ADirectory rootDir = new ADirectory(2);
        ADirectory dir = new ADirectory(3);
        
        rootDir.name = "root";
        dir.name = "bin";
        
        file1.name = "test_data.txt";
        file2.name = "execute.sh";
        file3.name = "test_maven.jar";
        file4.name = "MyWork.java";                
                
        rootDir.fileSystemElement[0] = dir;
        rootDir.fileSystemElement[1] = file1;
        
        dir.fileSystemElement[0] = file2;
        dir.fileSystemElement[1] = file3;
        dir.fileSystemElement[2] = file4;
        
        // Traverse tree
        String findMe = "MyWork.java";
        Integer index = 0;
        boolean foundFile = false;
        
        while (index < rootDir.fileSystemElement.length) {
            foundFile = traverseComposite(rootDir, index++, findMe);
            if (foundFile) {
                break;
            }
        }
        
        System.out.println(foundFile);
    }
    
    /**
     * 
     * @param dir
     * @param index
     * @param fileName
     * @return 
     */
    public static boolean traverseComposite(ADirectory dir, Integer index, String fileName) {
        
        // Avoid array out of bounds error
        if (dir.fileSystemElement.length <= index) {
            return false;
        }
        
        // Check if element is file first
        if (dir.fileSystemElement[index] instanceof AFile) {
            AFile file = (AFile) dir.fileSystemElement[index];
            
            if (file.name.equals(fileName)) {
                // Base case
                return true;
            } else {
                // Go to the next element within the same directory
                return traverseComposite(dir, ++index, fileName);
            }
            
        } else {
            // Recurse into the next directory
            ADirectory directory = (ADirectory) dir.fileSystemElement[index];
            return traverseComposite(directory, 0, fileName);
        }
        
    }   
}
