public interface Sippable {

    // You can have variables in interfaces!  However, they are automatically
    // _final_ (can't be modified, i.e. they act as constants)
    // even if you don't include the final keyword.
    
    public final int SIPPING_NOISE = 5;

    public int _sips = 0;
    
    public void sip();
    public void noisySip();
    
}
