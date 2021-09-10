import java.util.LinkedList;

public class ListCal {
    private LinkedList<Integer> list_1 = new LinkedList<Integer>();
    private LinkedList<Integer> list_2 = new LinkedList<Integer>();

    private LinkedList<Integer> list_T = new LinkedList<Integer>(); // temp
    private LinkedList<Integer> list_R = new LinkedList<Integer>(); // result
    
    public ListCal() {
        // list Create
        this.setList1();
        this.setList2();
        
        // Temp list create: Temp list = [1, 4, 5, 8, 2, 3, 5, 7, 9]; (list1 + list2)
        for (Integer num : list_1) {
            list_T.add(num);
        }
        
        for (Integer num : list_2) {
            list_T.add(num);
        }

        SortList();
    }
    

    // List sorting
    private void SortList() {
        // while (temp list is empty)
        while (list_T.size() != 0) {
            int min = list_T.get(0);    // min value of Temp list.
            int j = 0;                  // min's index
            
            // Selection Sort; find of min value.
            for (int i = 0; i < list_T.size(); i++) {
                if (min > list_T.get(i)) {  // if, min variable WAS NOT minimum,
                    min = list_T.get(i);    // value change
                    j = i;                  // find the index about 'old min' value in the Temp list for delete.
                }
            }

            list_R.add(min);    // Result list update
            list_T.remove(j);   // Temp list update
        }
    }


    // list 1 create
    public void setList1() {
        list_1.add(1);
        list_1.add(4);
        list_1.add(5);
        list_1.add(8);
    }

    
    // list 2 create
    public void setList2() {
        list_2.add(2);
        list_2.add(3);
        list_2.add(5);
        list_2.add(7);
        list_2.add(9);
    }


    public LinkedList<Integer> getListR() {
        return list_R;
    }


    public LinkedList<Integer> getList1() {
        return list_1;
    }


    public LinkedList<Integer> getList2() {
        return list_2;
    }

}
