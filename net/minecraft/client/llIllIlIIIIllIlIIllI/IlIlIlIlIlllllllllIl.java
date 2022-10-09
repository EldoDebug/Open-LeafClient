package net.minecraft.client.llIllIlIIIIllIlIIllI;

import java.lang.reflect.*;
import java.util.*;

class IlIlIlIlIlllllllllIl implements ParameterizedType
{
    @Override
    public Type[] getActualTypeArguments() {
        return new Type[] { String.class };
    }
    
    @Override
    public Type getRawType() {
        return List.class;
    }
    
    @Override
    public Type getOwnerType() {
        return null;
    }
}
