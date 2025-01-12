package myjava.designpatterns.composite;

public class ADirectory extends FileSystemElement {
    
    FileSystemElement[] fileSystemElement;
    
    ADirectory(Integer size) {
        fileSystemElement = new FileSystemElement[size];
    }
    
}
