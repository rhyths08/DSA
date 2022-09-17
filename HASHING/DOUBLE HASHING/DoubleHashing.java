import java.util.ArrayList;
public class DoubleHashing 
{
    String[] hashTable;
    int usedCellNumber;

    DoubleHashing(int size)
    {
        hashTable = new String[size];
        usedCellNumber = 0;
    }

    public int simpleASCIIHashFunction(String word, int M)
    {
        char ch[];
        ch = word.toCharArray();
        int i, sum;
        for(sum = 0,i=0; i<word.length(); i++)
        {
            sum = sum + ch[i];
        }
        return sum % M;
    }

    public double getLoadFactor()
    {
        double loadFactor = usedCellNumber * 1.0/hashTable.length;
        return loadFactor;
    }

    //rehash
    public void rehashKeys(String word)
    {
        usedCellNumber = 0;
        ArrayList<String> data = new ArrayList<String>();
        for(String s : hashTable)
        {
            if(s != null)
            {
                data.add(s);
            }
            data.add(word);
            hashTable = new String[hashTable.length * 2];
            for(String s1: data)
            {
                //insert in hash table
                insertInHashTable(s1);
            }
        }
    }

    public void displayHashTable()
    {
        if(hashTable == null)
        {
            System.out.println("HashTable doesnot exist");
        }
        else
        {
            System.out.println("\n---------HashTable---------");
            for(int i = 0; i<hashTable.length; i++)
            {
                System.out.println("Index "+i+", key:"+hashTable[i]);
            }
        }
    }

    private int addAllDigitsTogether(int sum)
    {
        int value = 0;
        while(sum > 0)
        {
            value = sum%10;
            sum = sum/10;
        }
        return value;
    }

    public int secondHashFunction(String x, int M)
    {
        char ch[];
        ch = x.toCharArray();
        int i,sum;
        for(sum =0,i=0; i<x.length(); i++)
        {
            sum+=ch[i];
        }
        while(sum > hashTable.length)
        {
            sum = addAllDigitsTogether(sum);
        }
        return sum%M;
    }

    public void insertInHashTable(String word)
    {
        double loadFactor = getLoadFactor();
        if(loadFactor >= 0.75)
        {
            rehashKeys(word);
        }
        else
        {
            int x = simpleASCIIHashFunction(word, hashTable.length);
            int y = secondHashFunction(word, hashTable.length);

            for(int i=0; i<hashTable.length; i++)
            {
                int newIndex = (x + (i*y))%hashTable.length;
                if(hashTable[newIndex] == null)
                {
                    hashTable[newIndex] = word;
                    System.out.println("The "+word+" successfully inserted at loacation: "+newIndex);
                    break;
                }
                else{
                    System.out.println(newIndex+" is already occupied. Trying nextempty cell");
                }
            }
        }
        usedCellNumber++;
    }
}
