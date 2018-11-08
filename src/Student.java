public class Student extends Person
{
    private final int freshman=1;
    private final int sophomore=2;
    private final int junior=3;
    private final int senior=4;

    public String toString()
    {
        return getClass().getSimpleName() + getName();
    }

}
