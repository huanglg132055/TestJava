package designPatterns.structuredModel.composite.secound;

public class ImageFile implements AbstractFile {
    private String name;

    public ImageFile(String name){
        super();
        this.name = name;
    }
    public void killVirus() {
        System.out.println("--图像文件：" + name + "，进行查杀");
    }
}
