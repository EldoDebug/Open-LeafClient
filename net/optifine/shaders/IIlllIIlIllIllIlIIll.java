package net.optifine.shaders;

import java.util.*;

public class IIlllIIlIllIllIlIIll
{
    private Deque llllIIIIlIIIlIlllIll;
    
    public IIlllIIlIllIllIlIIll() {
        this.llllIIIIlIIIlIlllIll = new ArrayDeque();
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII) {
        this.llllIIIIlIIIlIlllIll.addLast(ilIllIlIlIIIlIlIlIII);
        if (this.llllIIIIlIIIlIlllIll.size() > 100) {
            throw new RuntimeException("Program stack overflow: " + this.llllIIIIlIIIlIlllIll.size());
        }
    }
    
    public IlIllIlIlIIIlIlIlIII llllIIIIlIIIlIlllIll() {
        if (this.llllIIIIlIIIlIlllIll.isEmpty()) {
            throw new RuntimeException("Program stack empty");
        }
        return this.llllIIIIlIIIlIlllIll.pollLast();
    }
}
