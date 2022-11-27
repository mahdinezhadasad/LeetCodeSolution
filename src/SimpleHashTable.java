public class SimpleHashTable {
    
    private StoredEmployee[] hashtable;
    
    public SimpleHashTable() {
        
        hashtable = new StoredEmployee[10];
    }
    
    private int hashKey(String key) {
        
        return key.length () % hashtable.length;
    }
    
    public void put(String key, Employee employee) {
        
        int hashedKey = hashKey (key);
        
        if (occupied (hashedKey)) {
            int stopIndex = hashedKey;
            if (hashedKey == hashtable.length - 1) {
                hashedKey = 0;
            } else {
                hashedKey++;
            }
            while (occupied (hashedKey) && hashedKey != stopIndex) {
                
                hashedKey = (hashedKey + 1) % hashtable.length;
                
            }
            
        }
        if (occupied (hashedKey)) {
            
            System.out.println ("Sorry, there already an employee");
            
        } else {
            hashtable[hashedKey] = new StoredEmployee (key, employee);
        }
    }
    
    //<editor-fold desc="Description">
    private int findeKey(String key) {
        int hashedKey = hashKey (key);
        if (hashtable[hashedKey] != null && hashtable[hashedKey].key.equals (key)) {
            return hashedKey;
        }
        int stopIndex = hashedKey;
        if (hashedKey == hashtable.length - 1) {
            hashedKey = 0;
        } else {
            hashedKey++;
        }
        while (hashedKey != stopIndex && hashtable[hashedKey] != null && !hashtable[hashedKey].key.equals (key)) {
            hashedKey = (hashedKey + 1) % hashtable.length;
        }
        if (hashtable[hashedKey] != null &&
                hashtable[hashedKey].key.equals (key)) {
        
            return hashedKey;
        } else {
        
            return -1;
        }
    }
    //</editor-fomld>
    
    public Employee get(String key) {
        int hashedkey = findeKey (key);
        if (hashedkey == -1) {
            
            return null;
        }
        return hashtable[hashedkey].employee;
    }
    
    public Employee remove(String key){
        
        int hashedKey = findeKey (key);
        
        if(hashedKey == -1){
            
            return null;
        }
        
        Employee employee = hashtable[hashedKey].employee;
        hashtable[hashedKey] = null;
        StoredEmployee[] oldHashtable = hashtable;
        hashtable = new StoredEmployee[oldHashtable.length];
        for(int i=0; i<oldHashtable.length;i++){
            
            if(oldHashtable[i] !=null){
                
                put(oldHashtable[i].key,oldHashtable[i].employee);
            }
        }
        return employee;
    
    
    }
    private boolean occupied(int index) {
        
        return hashtable[index] != null;
    }
    public void printHashtable() {
        
        for (int i = 0; i < hashtable.length; i++) {
            
            if (hashtable[i].employee == null) {
                
                System.out.println ("empty");
            } else {
                
                System.out.println ("Position " + i + " :" + hashtable[i].employee);
            }
            
        }
    }
    
}