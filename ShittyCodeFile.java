public enum DataSize {
    BYTE,
    DOUBLE_BYTE,
    INT,
    LONG;
    
    public boolean isEqualTo(Object value) {
        if(value instanceof Byte && this.equals(BYTE)) {
            return true;
        } else if ((value instanceof Character || value instanceof Short) && this.equals(DOUBLE_BYTE)) {
            return true;
        } else if ((value instanceof Integer) && this.equals(INT)) {
            return true;
        } else if ((value instanceof Long) && this.equals(LONG)) {
            return true;
        }
        return false;
    }
}
