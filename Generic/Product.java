package JavaJava;

// Generic 사용 K, M 매개변수로 Product 정의
public class Product <K, M>{
    private K kind;
    private M model;

    // 제품의 종류를 반환
    public K getKind() {
        return kind;
    }

    // 제품의 종류를 설정
    public void setKind(K kind) {
        this.kind = kind;
    }

    public M getModel() {
        return model;
    }

    public void setModel(M model) {
        this.model = model;
    }
}
