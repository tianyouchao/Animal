package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        /*Animal animal;
        animal=new dog();
        animal.jiao();
        animal=new cat();
        animal.jiao();*/
        /*上面的很简单就是父类animal与子类dog与cat，在子类中重写方法来达到让其发出不同叫声*/
        dogg ding;
        catt dong;
        ding=new dogg();
        dong=new catt();
        ding.sum=32+Animalding.Max;
        dong.number=14+Animalding.Max;
        System.out.println("ding的年龄"+ding.sum+"死于"+ding.nianling(5));
        System.out.println("dong的年龄"+dong.number+"死于"+dong.nianling(50));
        /*下面这个就是Animalding接口由dogg与catt实现，方法完全重写*/
    }
}