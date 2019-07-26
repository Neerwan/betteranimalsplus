package its_meow.betteranimalsplus.client.renderer.entity;

import its_meow.betteranimalsplus.client.model.ModelShark;
import its_meow.betteranimalsplus.common.entity.EntityShark;
import its_meow.betteranimalsplus.init.ModTextures;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class RenderShark extends MobRenderer<EntityShark, ModelShark<EntityShark>> {

    public RenderShark(EntityRendererManager rendermanagerIn) {
        super(rendermanagerIn, new ModelShark<EntityShark>(), 2F);
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityShark entity) {
        int type = entity.getTypeNumber();
        switch (type) {
        case 1:
            return ModTextures.shark_1;
        case 2:
            return ModTextures.shark_2;
        case 3:
            return ModTextures.shark_3;
        default:
            return ModTextures.boar_1;
        }
    }

}