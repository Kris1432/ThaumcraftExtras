package thaumcraftextras.api.functions;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.block.Block;
import thaumcraftextras.register.BlockRegister;

public class DestroyFunctions {
    public static Map<Integer, Integer> canDestroy = new HashMap();

	public static void add(int blockId, int ghost)
	{
		canDestroy.put(blockId, ghost);
	}
	
	public static void remove(int blockId)
	{
		canDestroy.remove(blockId);
	}
}
