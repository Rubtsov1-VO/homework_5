package homework_1;

public class Main {
    public static void main(String[] args){
        IntegerArray arrayInt = new IntegerArray();
        BooleanArray arrayBoolean = new BooleanArray();


        arrayInt.setElement(2);
        arrayInt.setElement(4);
        System.out.println(arrayInt);
        //arrayInt.getByIndex(4);
        arrayInt.reverse(2);
        System.out.println(arrayInt);
        arrayInt.setElement(6, true);
        arrayInt.setElement(7, true);
        System.out.println(arrayInt);
        //arrayInt.countTrue();
        arrayInt.resetElement(7);
        System.out.println(arrayInt);

        arrayBoolean.setElement(2);
        arrayBoolean.setElement(4);
        System.out.println(arrayBoolean);
        //arrayBoolean.getByIndex(4);
        arrayBoolean.reverse(2);
        System.out.println(arrayBoolean);
        arrayBoolean.setElement(6);
        arrayBoolean.setElement(7);
        System.out.println(arrayBoolean);
        //arrayBoolean.countTrue();
        arrayBoolean.resetElement(7);
        System.out.println(arrayBoolean);





    }

}
