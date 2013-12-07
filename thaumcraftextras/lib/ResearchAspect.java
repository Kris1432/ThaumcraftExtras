package thaumcraftextras.lib;

import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;

public class ResearchAspect {

	public static AspectList pechTradeResearch = new AspectList().add(Aspect.ORDER, 5).add(Aspect.GREED, 5);

	public static AspectList magicTradeResearch = new AspectList().add(Aspect.ORDER, 15).add(Aspect.METAL, 5).add(Aspect.MAGIC, 5);

	public static AspectList xpExtractorResearch = new AspectList().add(Aspect.MAGIC, 25).add(Aspect.LIFE, 1).add(Aspect.LIFE, 10).add(Aspect.EXCHANGE, 5);
	public static AspectList ignisFuelResearch = new AspectList().add(Aspect.FIRE, 5);

	public static AspectList enderFociResearch = new AspectList().add(Aspect.MAGIC, 50).add(Aspect.ELDRITCH, 50).add(Aspect.ENTROPY, 25);
	public static AspectList arrowFociResearch = new AspectList().add(Aspect.MAGIC, 20).add(Aspect.AIR, 20).add(Aspect.WEAPON, 10);
	public static AspectList healFociResearch = new AspectList().add(Aspect.MAGIC, 50).add(Aspect.HEAL, 25).add(Aspect.ORDER, 1).add(Aspect.SENSES, 10).add(Aspect.SOUL, 5);
	public static AspectList speedFociResearch = new AspectList().add(Aspect.MAGIC, 50).add(Aspect.AIR, 25).add(Aspect.ORDER, 1).add(Aspect.SENSES, 10);
	public static AspectList xpFociResearch = new AspectList().add(Aspect.MAGIC, 25).add(Aspect.LIFE, 10).add(Aspect.EXCHANGE, 5).add(Aspect.MOTION, 5);
	public static AspectList returnFociResearch = new AspectList().add(Aspect.MAGIC, 25).add(Aspect.ELDRITCH, 40).add(Aspect.MOTION, 10);
	public static AspectList exchangeFociResearch = new AspectList().add(Aspect.MAGIC, 25).add(Aspect.EXCHANGE, 40).add(Aspect.MECHANISM, 5);
	public static AspectList smeltingFociResearch = new AspectList().add(Aspect.MAGIC, 25).add(Aspect.EXCHANGE, 40).add(Aspect.FIRE, 10).add(Aspect.ENTROPY, 5).add(Aspect.ORDER, 5);
	public static AspectList dispelFociResearch = new AspectList().add(Aspect.MAGIC, 25).add(Aspect.HEAL, 10).add(Aspect.ORDER, 10).add(Aspect.AURA, 5);
	public static AspectList destroyFociResearch = new AspectList().add(Aspect.MAGIC, 25).add(Aspect.ORDER, 10).add(Aspect.ENTROPY, 10).add(Aspect.DARKNESS, 5);
	public static AspectList freezeFociResearch = new AspectList().add(Aspect.MAGIC, 10).add(Aspect.ORDER, 10).add(Aspect.MOTION, 10).add(Aspect.TRAVEL, 5).add(Aspect.ICE, 10).add(Aspect.WEAPON, 10);

	public static AspectList waterBlockResearch = new AspectList().add(Aspect.MAGIC, 10).add(Aspect.WATER, 10);
	public static AspectList airBlockResearch = new AspectList().add(Aspect.AIR, 10).add(Aspect.MAGIC, 10);
	public static AspectList earthBlockResearch = new AspectList().add(Aspect.EARTH, 10).add(Aspect.MAGIC, 10).add(Aspect.MOTION, 5).add(Aspect.WEAPON, 10);
	public static AspectList fireBlockResearch = new AspectList().add(Aspect.FIRE, 10).add(Aspect.MAGIC, 10);
	public static AspectList lightBlockResearch = new AspectList().add(Aspect.LIGHT, 10).add(Aspect.MAGIC, 10);
	public static AspectList enderBlockResearch = new AspectList().add(Aspect.MAGIC, 10).add(Aspect.ENTROPY, 10).add(Aspect.ELDRITCH, 10).add(Aspect.MOTION, 10).add(Aspect.TRAVEL, 5);

}
