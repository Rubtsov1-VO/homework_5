package homework_1;

public class BooleanArray implements  CustomArray {

    private boolean[] array = new boolean[size];

    @Override
    public boolean getByIndex(int index) {
        if (index>=0) return array[index];
        else throw  new IllegalArgumentException();
    }

    @Override
    public void reverse(int index) {
        array[index] = !array[index];
    }


    @Override
    public void setElement(int index, boolean value){
        array[index]=value;
    }

    @Override
    public void setElement(int index){
        array[index]=true;
    }


    @Override
    public void resetElement(int index){
        array[index]=false;
    }


    @Override
    public int countTrue(){
        int count =0;
        for(boolean value:array){
            if (value) count++;
        }
        return count;
    }

    @Override
    public String toString(){
        String[] str = new String[size];
        for (int i=0; i<size; i++){
            str[i] = getByIndex(i) ? "1" : "0";
        }
        return String.join(", ", str);
    }
}
