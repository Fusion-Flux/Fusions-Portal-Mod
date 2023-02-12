package com.fusionflux.portalcubed.sound;

import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class PortalCubedSounds {
    public static final Identifier GEL_BOUNCE = new Identifier("portalcubed:gel_bounce");
    public static final Identifier GEL_RUN = new Identifier("portalcubed:gel_run");
    public static final Identifier GEL_SPLAT = new Identifier("portalcubed:gel_splat");
    public static final Identifier PORTAL_GUN_PRIMARY = new Identifier("portalcubed:portal_gun_primary");
    public static final Identifier PORTAL_GUN_SECONDARY = new Identifier("portalcubed:portal_gun_secondary");
    public static final Identifier PORTAL_INVALID_SURFACE = new Identifier("portalcubed:portal_invalid_surface");
    public static final Identifier NOTHING_TO_GRAB = new Identifier("portalcubed:nothing_to_grab");
    public static final Identifier PORTAL_AMBIANCE = new Identifier("portalcubed:portal_ambience");
    public static final Identifier PORTAL_ENTER = new Identifier("portalcubed:portal_enter");
    public static final Identifier PORTAL_EXIT = new Identifier("portalcubed:portal_exit");
    public static final Identifier PORTAL_OPEN = new Identifier("portalcubed:portal_open");
    public static final Identifier PORTAL_CLOSE = new Identifier("portalcubed:portal_close");
    public static final Identifier PORTAL_FIZZLE = new Identifier("portalcubed:portal_fizzle");
    public static final Identifier CUBE_HIT_HIGH = new Identifier("portalcubed:cube_hit_high");
    public static final Identifier CUBE_HIT_LOW = new Identifier("portalcubed:cube_hit_low");
    public static final Identifier CUBE_SCRAPE = new Identifier("portalcubed:cube_scrape");
    public static final Identifier COMPANION_CUBE_AMBIANCE = new Identifier("portalcubed:companion_cube_ambiance");
    public static final Identifier MATERIAL_EMANCIPATION = new Identifier("portalcubed:material_emancipation");

    public static final Identifier ROCKET_FIRE = new Identifier("portalcubed:rocket_fire");
    public static final Identifier ROCKET_FLY = new Identifier("portalcubed:rocket_fly");
    public static final Identifier ROCKET_LOCKED = new Identifier("portalcubed:rocket_locked");
    public static final Identifier ROCKET_LOCKING = new Identifier("portalcubed:rocket_locking");
    public static final Identifier ROCKET_EXPLODE = new Identifier("portalcubed:rocket_explode");

    public static final Identifier LASER_EMITTER_ACTIVATE = new Identifier("portalcubed:laser/emitter_activate");
    public static final Identifier LASER_NODE_MUSIC = new Identifier("portalcubed:laser/node_music");
    public static final Identifier LASER_NODE_ACTIVATE = new Identifier("portalcubed:laser/node_activate");
    public static final Identifier LASER_NODE_DEACTIVATE = new Identifier("portalcubed:laser/node_deactivate");

    public static final Identifier TBEAM_ENTER = new Identifier("portalcubed:tbeam/enter");
    public static final Identifier TBEAM_TRAVEL = new Identifier("portalcubed:tbeam/travel");

    public static final Identifier RADIO_MUSIC = new Identifier("portalcubed:radio");
    public static final Identifier EXILE_SONG = new Identifier("portalcubed:exile_vilify");
    public static final Identifier CURIOSITY_CORE_SOUND = new Identifier("portalcubed:curiosity_core");
    public static final Identifier ANGER_CORE_SOUND = new Identifier("portalcubed:anger_core");
    public static final Identifier CAKE_CORE_SOUND = new Identifier("portalcubed:cake_core");

    public static final Identifier SPACE_CORE_SOUND = new Identifier("portalcubed:space_core");
    public static final Identifier FACT_CORE_SOUND = new Identifier("portalcubed:fact_core");
    public static final Identifier ADVENTURE_CORE_SOUND = new Identifier("portalcubed:adventure_core");

    public static final SoundEvent GEL_BOUNCE_EVENT = new SoundEvent(GEL_BOUNCE);
    public static final SoundEvent GEL_RUN_EVENT = new SoundEvent(GEL_RUN);
    public static final SoundEvent GEL_SPLAT_EVENT = new SoundEvent(GEL_SPLAT);
    public static final SoundEvent PORTAL_AMBIENT_EVENT = new SoundEvent(PORTAL_AMBIANCE);
    public static final SoundEvent FIRE_EVENT_PRIMARY = new SoundEvent(PORTAL_GUN_PRIMARY);
    public static final SoundEvent FIRE_EVENT_SECONDARY = new SoundEvent(PORTAL_GUN_SECONDARY);
    public static final SoundEvent INVALID_PORTAL_EVENT = new SoundEvent(PORTAL_INVALID_SURFACE);
    public static final SoundEvent NOTHING_TO_GRAB_EVENT = new SoundEvent(NOTHING_TO_GRAB);
    public static final SoundEvent ENTITY_ENTER_PORTAL = new SoundEvent(PORTAL_ENTER);
    public static final SoundEvent ENTITY_EXIT_PORTAL = new SoundEvent(PORTAL_EXIT);
    public static final SoundEvent ENTITY_PORTAL_OPEN = new SoundEvent(PORTAL_OPEN);
    public static final SoundEvent ENTITY_PORTAL_CLOSE = new SoundEvent(PORTAL_CLOSE);
    public static final SoundEvent ENTITY_PORTAL_FIZZLE = new SoundEvent(PORTAL_FIZZLE);
    public static final SoundEvent CUBE_HIGH_HIT_EVENT = new SoundEvent(CUBE_HIT_HIGH);
    public static final SoundEvent CUBE_LOW_HIT_EVENT = new SoundEvent(CUBE_HIT_LOW);
    public static final SoundEvent CUBE_SCRAPE_EVENT = new SoundEvent(CUBE_SCRAPE);
    public static final SoundEvent COMPANION_CUBE_AMBIANCE_EVENT = new SoundEvent(COMPANION_CUBE_AMBIANCE);
    public static final SoundEvent MATERIAL_EMANCIPATION_EVENT = new SoundEvent(MATERIAL_EMANCIPATION);

    public static final SoundEvent ROCKET_FIRE_EVENT = new SoundEvent(ROCKET_FIRE);
    public static final SoundEvent ROCKET_FLY_EVENT = new SoundEvent(ROCKET_FLY);
    public static final SoundEvent ROCKET_LOCKED_EVENT = new SoundEvent(ROCKET_LOCKED);
    public static final SoundEvent ROCKET_LOCKING_EVENT = new SoundEvent(ROCKET_LOCKING);
    public static final SoundEvent ROCKET_EXPLODE_EVENT = new SoundEvent(ROCKET_EXPLODE);

    public static final SoundEvent LASER_EMITTER_ACTIVATE_EVENT = new SoundEvent(LASER_EMITTER_ACTIVATE);
    public static final SoundEvent LASER_NODE_MUSIC_EVENT = new SoundEvent(LASER_NODE_MUSIC);
    public static final SoundEvent LASER_NODE_ACTIVATE_EVENT = new SoundEvent(LASER_NODE_ACTIVATE);
    public static final SoundEvent LASER_NODE_DEACTIVATE_EVENT = new SoundEvent(LASER_NODE_DEACTIVATE);

    public static final SoundEvent TBEAM_ENTER_EVENT = new SoundEvent(TBEAM_ENTER);
    public static final SoundEvent TBEAM_TRAVEL_EVENT = new SoundEvent(TBEAM_TRAVEL);

    public static final SoundEvent RADIO_MUSIC_EVENT = new SoundEvent(RADIO_MUSIC);
    public static final SoundEvent EXILE_MUSIC_EVENT = new SoundEvent(EXILE_SONG);
    public static final SoundEvent CURIOSITY_CORE_EVENT = new SoundEvent(CURIOSITY_CORE_SOUND);
    public static final SoundEvent ANGER_CORE_EVENT = new SoundEvent(ANGER_CORE_SOUND);
    public static final SoundEvent CAKE_CORE_EVENT = new SoundEvent(CAKE_CORE_SOUND);
    public static final SoundEvent SPACE_CORE_EVENT = new SoundEvent(SPACE_CORE_SOUND);
    public static final SoundEvent FACT_CORE_EVENT = new SoundEvent(FACT_CORE_SOUND);
    public static final SoundEvent ADVENTURE_CORE_EVENT = new SoundEvent(ADVENTURE_CORE_SOUND);

    public static void registerSounds() {
        Registry.register(Registry.SOUND_EVENT, GEL_BOUNCE, GEL_BOUNCE_EVENT);
        Registry.register(Registry.SOUND_EVENT, GEL_RUN, GEL_RUN_EVENT);
        Registry.register(Registry.SOUND_EVENT, GEL_SPLAT, GEL_SPLAT_EVENT);
        Registry.register(Registry.SOUND_EVENT, PORTAL_AMBIANCE, PORTAL_AMBIENT_EVENT);
        Registry.register(Registry.SOUND_EVENT, PORTAL_GUN_PRIMARY, FIRE_EVENT_PRIMARY);
        Registry.register(Registry.SOUND_EVENT, PORTAL_GUN_SECONDARY, FIRE_EVENT_SECONDARY);
        Registry.register(Registry.SOUND_EVENT, PORTAL_INVALID_SURFACE, INVALID_PORTAL_EVENT);
        Registry.register(Registry.SOUND_EVENT, NOTHING_TO_GRAB, NOTHING_TO_GRAB_EVENT);
        Registry.register(Registry.SOUND_EVENT, PORTAL_ENTER, ENTITY_ENTER_PORTAL);
        Registry.register(Registry.SOUND_EVENT, PORTAL_EXIT, ENTITY_EXIT_PORTAL);
        Registry.register(Registry.SOUND_EVENT, PORTAL_OPEN, ENTITY_PORTAL_OPEN);
        Registry.register(Registry.SOUND_EVENT, PORTAL_CLOSE, ENTITY_PORTAL_CLOSE);
        Registry.register(Registry.SOUND_EVENT, PORTAL_FIZZLE, ENTITY_PORTAL_FIZZLE);
        Registry.register(Registry.SOUND_EVENT, CUBE_HIT_HIGH, CUBE_HIGH_HIT_EVENT);
        Registry.register(Registry.SOUND_EVENT, CUBE_HIT_LOW, CUBE_LOW_HIT_EVENT);
        Registry.register(Registry.SOUND_EVENT, CUBE_SCRAPE, CUBE_SCRAPE_EVENT);

        Registry.register(Registry.SOUND_EVENT, COMPANION_CUBE_AMBIANCE, COMPANION_CUBE_AMBIANCE_EVENT);
        Registry.register(Registry.SOUND_EVENT, MATERIAL_EMANCIPATION, MATERIAL_EMANCIPATION_EVENT);

        Registry.register(Registry.SOUND_EVENT, ROCKET_FIRE, ROCKET_FIRE_EVENT);
        Registry.register(Registry.SOUND_EVENT, ROCKET_FLY, ROCKET_FLY_EVENT);
        Registry.register(Registry.SOUND_EVENT, ROCKET_LOCKED, ROCKET_LOCKED_EVENT);
        Registry.register(Registry.SOUND_EVENT, ROCKET_LOCKING, ROCKET_LOCKING_EVENT);
        Registry.register(Registry.SOUND_EVENT, ROCKET_EXPLODE, ROCKET_EXPLODE_EVENT);

        Registry.register(Registry.SOUND_EVENT, LASER_EMITTER_ACTIVATE, LASER_EMITTER_ACTIVATE_EVENT);
        Registry.register(Registry.SOUND_EVENT, LASER_NODE_MUSIC, LASER_NODE_MUSIC_EVENT);
        Registry.register(Registry.SOUND_EVENT, LASER_NODE_ACTIVATE, LASER_NODE_ACTIVATE_EVENT);
        Registry.register(Registry.SOUND_EVENT, LASER_NODE_DEACTIVATE, LASER_NODE_DEACTIVATE_EVENT);

        Registry.register(Registry.SOUND_EVENT, TBEAM_ENTER, TBEAM_ENTER_EVENT);
        Registry.register(Registry.SOUND_EVENT, TBEAM_TRAVEL, TBEAM_TRAVEL_EVENT);

        Registry.register(Registry.SOUND_EVENT, RADIO_MUSIC, RADIO_MUSIC_EVENT);
        Registry.register(Registry.SOUND_EVENT, EXILE_SONG, EXILE_MUSIC_EVENT);
        Registry.register(Registry.SOUND_EVENT, CURIOSITY_CORE_SOUND, CURIOSITY_CORE_EVENT);
        Registry.register(Registry.SOUND_EVENT, ANGER_CORE_SOUND, ANGER_CORE_EVENT);
        Registry.register(Registry.SOUND_EVENT, CAKE_CORE_SOUND, CAKE_CORE_EVENT);

        Registry.register(Registry.SOUND_EVENT, SPACE_CORE_SOUND, SPACE_CORE_EVENT);
        Registry.register(Registry.SOUND_EVENT, FACT_CORE_SOUND, FACT_CORE_EVENT);
        Registry.register(Registry.SOUND_EVENT, ADVENTURE_CORE_SOUND, ADVENTURE_CORE_EVENT);
    }
}
