import java.util.Arrays;
import java.util.Comparator;

public class ManagerComputer {
    Computer[] listComp = new Computer[0];

    public double caculateTotalPrice() {
        double totalPrice = 0;
        for (Computer comp: listComp) {
            totalPrice += (comp.getPrice() * comp.getQuantity());
        }
        return totalPrice;
    }
    public void sortListCompWithCompPrice(boolean ascending) {
        Comparator<Computer> comparator = Comparator.comparing(Computer:: getPrice);
        if (!ascending) {
            comparator = comparator.reversed();
        }
        Arrays.sort(listComp, comparator);
    }
    public boolean removeCompWithCompName(String deleteComp) {
        for (int i=0; i<listComp.length; i++) {
            if (listComp[i].getName().equalsIgnoreCase(deleteComp)) {
                Computer[] newListComp = new Computer[listComp.length - 1];
                System.arraycopy(listComp, 0, newListComp,0, i);
                System.arraycopy(listComp, i+1, newListComp, i, listComp.length - i - 1);
                listComp = newListComp;
                return true;
            }
        }
        return false;
    }
    public double findPriceWithCompName(String name) {
        for (Computer comp: listComp) {
            if (comp.getName().equalsIgnoreCase(name)) {
                return comp.getPrice();
            }
        }
        return -1;
    }
    public Computer[] addComputerToListComps(Computer newComp) {
        if (listComp.length<=1000) {
            Computer[] newListComps = new Computer[listComp.length + 1];
            newListComps[0] = newComp;
            System.arraycopy(listComp, 0, newListComps, 1, listComp.length);
            listComp = newListComps;
        }
        return listComp;
    }
    public void displaylistComp() {
        for (Computer comp: listComp) {
            System.out.println(comp.toString());
        }
    }
}
