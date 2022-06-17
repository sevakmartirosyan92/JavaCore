package classwork.chapter7.dinamicarray;

public class DinamicArray {
    int[] array = new int[10];
    int size = 0;


    void add(int value) {
        if (size == array.length) {
            increaseArray();
        }
        array[size++] = value;
    }

    //Գրել մեթոդ isEmpty անունով, որը կվերադարձնի true եթե մեր dynamicArray-ի մեջ չունենանք ոչ մի էլեմենտ.
    // Եթե ունենք՝ false
 //   boolean isEmpty() {
   //     if (size == 0) ;
     //   return true || false;
//}
//Գրել մեթոդ getByIndex անունով, որը կընդունի ինդեքս, և կվերադարձնի այդ ինդեքսի տակ ընկած թիվը,
// եթե չկա թող վերադարձնի 0;
    int getByIndex(int index){
        if (!(index<0)&&(index>size)){
        }return 0;

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