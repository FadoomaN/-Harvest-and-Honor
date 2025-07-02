package Units;

public class Projectile
{
    public int sourceX, sourceY, targetX, targetY;

    public Projectile(int sourceX, int sourceY, int targetX, int targetY)
    {
        this.sourceX = sourceX;
        this.sourceY = sourceY;
        this.targetX = targetX;
        this.targetY = targetY;

        Thread t = new Thread()
        {
            public void run()
            {

            }
        };
    }

    void running()
    {

    }

}
