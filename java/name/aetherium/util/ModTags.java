package name.aetherium.util;

import name.aetherium.Aetherium;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {

        public static final TagKey<Block> AETHERIUM_ORES =
                createTag("aetherium_ores");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(Aetherium.MOD_ID, name));
        }
    }

}
