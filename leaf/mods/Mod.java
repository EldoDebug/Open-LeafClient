package leaf.mods;

import java.awt.*;
import leaf.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.*;

public class Mod
{
    private String name;
    private Color color;
    private int x;
    private int y;
    private int intColor;
    private int widthMiss;
    private float heightMiss;
    private boolean toggled;
    private lIIIIlIIIIIlllIllIII lIIIlllIIIllIIIllIII;
    
    public Mod(final String name, final int x, final int y, final int n, final int n2, final int n3, final int widthMiss, final boolean toggled) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.widthMiss = widthMiss;
        this.heightMiss = widthMiss / 127.5f;
        this.lIIIlllIIIllIIIllIII = new lIIIIlIIIIIlllIllIII(x, y, this.getWidth(), this.getHeight(), name);
        this.color = new Color(n, n2, n3);
        this.intColor = this.color.getRGB();
        this.toggled = toggled;
    }
    
    public void toggle() {
        this.toggled = !this.toggled;
    }
    
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3) {
        this.color = new Color(n, n2, n3);
        this.intColor = this.color.getRGB();
    }
    
    public String getName() {
        return this.name;
    }
    
    public lIIIIlIIIIIlllIllIII llIllIIIIIllIlIIIIlI() {
        return this.lIIIlllIIIllIIIllIII;
    }
    
    public int IlIIIlIlIIIllIlIlIIl() {
        return this.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll();
    }
    
    public int IlIlIIIllIllIIIIIllI() {
        return this.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl();
    }
    
    public int getWidth() {
        return 0;
    }
    
    public int getHeight() {
        return 0;
    }
    
    public int getIntColor() {
        return this.intColor;
    }
    
    public Color getColor() {
        return this.color;
    }
    
    public void llllIIIIlIIIlIlllIll(final int widthMiss) {
        this.widthMiss = widthMiss;
        this.heightMiss = this.widthMiss / 127.5f;
    }
    
    public int llIIlIIIlIIIllIlIIIl() {
        return this.widthMiss;
    }
    
    public float llIllIlIIIIllIlIIllI() {
        return this.heightMiss;
    }
    
    public boolean lIlIlIIIllIIllIIIllI() {
        return this.toggled;
    }
    
    public void render() {
    }
    
    public void renderDummy(final int n, final int n2) {
    }
}
