package Inferface;
interface writeInterFaceHere {
    String color = "Green";
    int height = 1;
    void doSomething();
}
public class InterfaceExample implements  writeInterFaceHere{

    public static void main(String[] args) {
        System.out.println(color);

        InterfaceExample k = new InterfaceExample(); //lav et ny objekt fra interfaceExample
        k.doSomething();
    }

    @Override  //override her betyder, at den klasse som implementerer interfacet får dennes metoder.
    public void doSomething() {
        System.out.println("Now it does something!");
    }
}
