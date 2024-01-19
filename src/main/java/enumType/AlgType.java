package enumType;

public enum AlgType {
    AlgNum1("Алгоритм 1", 0),
    AlgNum2("Алгоритм 2", 1),
    AlgNum3("Алгоритм 3", 2),
    AlgNum4("Алгоритм 4", 3),
    AlgNum5("Алгоритм 5", 4),
    AlgNum6_7("Алгоритм 6,7", 5);

    private final String name;
    private final Integer index;

    AlgType(String name, Integer index) {
        this.name = name;
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public Integer getIndex() {
        return index;
    }
}
