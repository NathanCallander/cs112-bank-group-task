import src.SavingsAccount;

import java.util.ArrayList;
import java.util.HashMap;

public class Bank {
    private HashMap<String, BankAccount> idAccountMap;
    private ArrayList<String> idList;

    public Bank() {
        HashMap<String, BankAccount> idAccountMap = new HashMap<>();
        ArrayList<String> idList = new ArrayList<>();
    }

    public void addAccount(String id, BankAccount bankAccount) {
        // Could add in an if statement here to check the ID doesn't already exist but the task description doesn't detail the need for one
        idAccountMap.put(id, bankAccount);
        idList.add(id);
    }

    public boolean removeAccount(String id) {
        if (idList.contains(id)) {
            idList.remove(id);
            idAccountMap.remove(id);
            return true;
        } else {
            return false;
        }
    }

    public void printAllAccounts() {
        for(String id : idList) {
            if(idAccountMap.containsKey(id)) {
                idAccountMap.get(id).printDetails();
            }
        }
    }
    public void printAllSavingsAccounts() {
        for(String id : idList) {
            if(idAccountMap.containsKey(id)) {
                if(idAccountMap.get(id) instanceof SavingsAccount) {
                    idAccountMap.get(id).printDetails();
                }
            }
        }
    }

//    public void printAllCurrentAccounts() {
//        for(String id : idList) {
//            if(idAccountMap.containsKey(id)) {
//                if(idAccountMap.get(id) instanceof CurrentAccount) {
//                    idAccountMap.get(id).printDetails();
//                }
//            }
//        }
//    }


}




