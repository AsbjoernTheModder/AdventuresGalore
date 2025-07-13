package net.mcreator.adventuresgalore.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.neoforged.neoforge.client.event.RenderGuiEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.EventPriority;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.client.Minecraft;

import net.mcreator.adventuresgalore.procedures.EnitityHealthReturnTextProcedure;
import net.mcreator.adventuresgalore.procedures.EnitityArmorReturnTextProcedure;

@EventBusSubscriber({Dist.CLIENT})
public class HealthtrackertestOverlay {
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int w = event.getGuiGraphics().guiWidth();
		int h = event.getGuiGraphics().guiHeight();
		Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;
		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			world = entity.level();
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
		}
		if (true) {
			event.getGuiGraphics().drawString(Minecraft.getInstance().font,

					EnitityHealthReturnTextProcedure.execute(world, entity), w / 2 + 0, 8, -65536, false);
			event.getGuiGraphics().drawString(Minecraft.getInstance().font,

					EnitityArmorReturnTextProcedure.execute(world, entity), w / 2 + 0, 17, -10066330, false);
		}
	}
}