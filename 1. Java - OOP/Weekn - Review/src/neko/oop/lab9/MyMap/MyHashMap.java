package neko.oop.lab9.MyMap;

public class MyHashMap implements MyMap {
    final private static int INITIAL_SIZE = 8;
    private MyHashMapEntry[] table;
    private int size;

    public MyHashMap() {
        table = new MyHashMapEntry[INITIAL_SIZE];
        size = 0;
    }

    public double capacityRatio() {
        return (double) size / table.length;
    }

    void enlarge() {
        MyHashMapEntry[] oldTable = table;
        table = new MyHashMapEntry[table.length * 2];
        size = 0;
        for (MyHashMapEntry entry : oldTable) {
            if (entry != null) {
                put(entry.getKey(), entry.getValue());
            }
        }
    }

    int getBucket(Object key) {
        int bucket = (Math.abs(key.hashCode()) % table.length);
        while (table[bucket] != null && !table[bucket].getKey().equals(key)) {
            bucket = (bucket + 1) % table.length;
        }
        return bucket;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void put(Object key, Object value) {
        if (capacityRatio() > 0.75) {
            enlarge();
        }
        int bucket = getBucket(key);
        if (table[bucket] == null) {
            table[bucket] = new MyHashMapEntry(key, value);
            size++;
        }
    }

    @Override
    public void remove(Object key) {
        int bucket = getBucket(key);
        if (table[bucket] != null) {
            table[bucket] = null;
            size--;
        }
    }

    @Override
    public boolean contains(Object key) {
        return table[getBucket(key)] != null;
    }

    @Override
    public Object get(Object key) {
        int bucket = getBucket(key);
        if (table[bucket] != null) {
            return table[bucket].getValue();
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < table.length; i++) {
            if (table[i] == null) {
                sb.append(String.format("[bucket %d] > null\n", i));
            } else {
                sb.append(String.format("[bucket %d] > (%s, %s)\n", i, table[i].getKey(), table[i].getValue()));
            }
        }
        return sb.toString();
    }
}
