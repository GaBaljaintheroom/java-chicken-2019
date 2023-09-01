public enum ProgressMessage {
    MAIN_MESSAGE("## 메인화면"),
    SELECT_NUMBER("## 원하는 기능을 선택하세요.");

    private final String message;

    ProgressMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}
