package homework.dinamicarray;

public class DinamicArray {
    int[] array = new int[10];
    int size = 0;
    int index = 0;

    //Գրել մեթոդ isEmpty անունով, որը կվերադարձնի true եթե մեր dynamicArray-ի մեջ չունենանք ոչ մի էլեմենտ.
    // Եթե ունենք՝ false
    public boolean isEmpty() {
        if (index > 0 && index <= size) {
        }
        return false;
    }

    //Գրել մեթոդ getByIndex անունով, որը կընդունի ինդեքս, և կվերադարձնի այդ ինդեքսի տակ ընկած թիվը,
    // եթե չկա թող վերադարձնի 0;
    public void getByIndex(int index) {
        if (index >= size || index < 0)
            System.out.println("no element in this index");
        else return;
    }
    //Գրել մեթոդ add(int index, int value) ,,,,,
    public void add(int index, int value){
        for (int i = size - 1; i >=index ; i--) {
            array[i+1] = array[1];
        }
    }






    void add(int value) {
        if (size == array.length) {
            increaseArray();
        }
        array[size++] = value;
    }

    private void increaseArray() {
        int[] temp = new int[array.length + 10];
        for (int i = 0; i < size; i++) {
            temp[i] = array[i];
        }
        array = temp;
    }

    void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");

        }
    }
}