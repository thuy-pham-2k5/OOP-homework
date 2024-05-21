import java.util.Arrays;
import java.util.Comparator;

public class ManagerPhone {
    Phone[] listPhones = new Phone[0];

    public double caculateTotalPrice() {
        double totalPrice = 0;
        for (Phone phone: listPhones) {
            totalPrice += (phone.getPrice() * phone.getNumber());
        }
        return totalPrice;
    }
    public void sortPhoneWithPhonePrice(boolean ascending) {
        Comparator<Phone> comparator = Comparator.comparing(Phone::getPrice);
        if (!ascending) {
            comparator = comparator.reversed();
        }
        Arrays.sort(listPhones, comparator);
    }
    public boolean removePhoneWithPhoneName(String deletePhoneName) {
        for (int i=0; i<listPhones.length; i++) {
            if (listPhones[i].getName().equalsIgnoreCase(deletePhoneName)) {
                Phone[] newPhones = new Phone[listPhones.length -1];
                System.arraycopy(listPhones, 0, newPhones, 0, i);
                System.arraycopy(listPhones, i+1, newPhones, i, listPhones.length - i -1);
                listPhones = newPhones;
                return true;
            }
        }
        return false;
    }
    public Double findPricePhoneWithPhoneName(String keyword) {
        for (Phone phone: listPhones) {
            if (phone.getName().equalsIgnoreCase(keyword)) {
                return phone.getPrice();
            }
        }
        return null;
    }
    public Phone[] addPhoneToListPhones(Phone newPhone) {
        Phone[] newListPhones = new Phone[listPhones.length + 1];
        newListPhones[0] = newPhone;
        System.arraycopy(listPhones, 0, newListPhones, 1, listPhones.length);
        listPhones = newListPhones;
        return  listPhones;
    }
    public void displayListPhone() {
        for (Phone phone: listPhones) {
            System.out.println(phone.toString());
        }
    }
}
