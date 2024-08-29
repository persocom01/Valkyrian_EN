package data.missions.unexpectedtrouble;

import com.fs.starfarer.api.combat.BattleObjectiveAPI;
import com.fs.starfarer.api.campaign.CargoAPI.CrewXPLevel;
import com.fs.starfarer.api.fleet.FleetGoal;
import com.fs.starfarer.api.fleet.FleetMemberType;
import com.fs.starfarer.api.mission.FleetSide;
import com.fs.starfarer.api.mission.MissionDefinitionAPI;
import com.fs.starfarer.api.mission.MissionDefinitionPlugin;

public class MissionDefinition implements MissionDefinitionPlugin {

	public void defineMission(MissionDefinitionAPI api) {

		// Set up the fleets so we can add ships and fighter wings to them.
		// In this scenario, the fleets are attacking each other, but
		// in other scenarios, a fleet may be defending or trying to escape
		api.initFleet(FleetSide.PLAYER, "VKS", FleetGoal.ATTACK, false);
		api.initFleet(FleetSide.ENEMY, "ISS", FleetGoal.ATTACK, true);

		// Set a small blurb for each fleet that shows up on the mission detail and
		// mission results screens to identify each side.
		api.setFleetTagline(FleetSide.PLAYER, "Valkyrian第四正面战场舰队");
		api.setFleetTagline(FleetSide.ENEMY, "海盗基地舰队");
		
		// These show up as items in the bulleted list under 
		// "Tactical Objectives" on the mission detail screen
		api.addBriefingItem("击败海盗基地和他的舰队！");
		api.addBriefingItem("VKS Liliana 和她的姊妹舰必须存活!");
		api.addBriefingItem("VKS Skyshard 是一艘原型机，她也必须存活！");
		
		// Set up the player's fleet.  Variant names come from the
		// files in data/variants and data/variants/fighters
		api.addToFleet(FleetSide.PLAYER, "valk_nirvana_II_A", FleetMemberType.SHIP, "VKS Liliana", true, CrewXPLevel.ELITE);
		api.addToFleet(FleetSide.PLAYER, "valk_nirvana_II_A", FleetMemberType.SHIP, "VKS Antalija", false, CrewXPLevel.ELITE);
		api.addToFleet(FleetSide.PLAYER, "valk_nirvana_I_A", FleetMemberType.SHIP, false, CrewXPLevel.REGULAR);
		api.addToFleet(FleetSide.PLAYER, "valk_almire_II_A", FleetMemberType.SHIP, false, CrewXPLevel.REGULAR);
		api.addToFleet(FleetSide.PLAYER, "valk_nirvana_I_A", FleetMemberType.SHIP, false, CrewXPLevel.VETERAN);
		api.addToFleet(FleetSide.PLAYER, "valk_heron_B", FleetMemberType.SHIP, false, CrewXPLevel.REGULAR);
		api.addToFleet(FleetSide.PLAYER, "valk_heron_B", FleetMemberType.SHIP, false, CrewXPLevel.REGULAR);
		api.addToFleet(FleetSide.PLAYER, "valk_eclair_A", FleetMemberType.SHIP, "VKS Skyshard", false, CrewXPLevel.ELITE);
		api.addToFleet(FleetSide.PLAYER, "valk_elfheim_A", FleetMemberType.SHIP, false, CrewXPLevel.VETERAN);
		api.addToFleet(FleetSide.PLAYER, "valk_elfheim_S", FleetMemberType.SHIP, false, CrewXPLevel.VETERAN);
		api.addToFleet(FleetSide.PLAYER, "valk_elfheim_S", FleetMemberType.SHIP, false, CrewXPLevel.VETERAN);
		api.addToFleet(FleetSide.PLAYER, "valk_inquisitor_A", FleetMemberType.SHIP, false, CrewXPLevel.REGULAR);
		api.addToFleet(FleetSide.PLAYER, "valk_jenova_ECM", FleetMemberType.SHIP, false, CrewXPLevel.VETERAN);
		api.addToFleet(FleetSide.PLAYER, "valk_yuusha_A", FleetMemberType.SHIP, false, CrewXPLevel.REGULAR);
		api.addToFleet(FleetSide.PLAYER, "valk_yuusha_A", FleetMemberType.SHIP, false, CrewXPLevel.REGULAR);
		api.addToFleet(FleetSide.PLAYER, "valk_firefly_wing", FleetMemberType.FIGHTER_WING, false, CrewXPLevel.VETERAN);
		api.addToFleet(FleetSide.PLAYER, "valk_firefly_wing", FleetMemberType.FIGHTER_WING, false, CrewXPLevel.VETERAN);
		api.addToFleet(FleetSide.PLAYER, "valk_azgard_wing", FleetMemberType.FIGHTER_WING, false, CrewXPLevel.REGULAR);
		api.addToFleet(FleetSide.PLAYER, "valk_azgard_wing", FleetMemberType.FIGHTER_WING, false, CrewXPLevel.REGULAR);
		api.addToFleet(FleetSide.PLAYER, "valk_azgard_wing", FleetMemberType.FIGHTER_WING, false, CrewXPLevel.REGULAR);
		api.addToFleet(FleetSide.PLAYER, "valk_lightning_wing", FleetMemberType.FIGHTER_WING, false, CrewXPLevel.GREEN);
		api.addToFleet(FleetSide.PLAYER, "valk_lightning_wing", FleetMemberType.FIGHTER_WING, false, CrewXPLevel.GREEN);

		
		
		// Mark both ships as essential - losing either one results
		// in mission failure. Could also be set on an enemy ship,
		// in which case destroying it would result in a win.
		api.defeatOnShipLoss("VKS Liliana");
		api.defeatOnShipLoss("VKS Antalija");
		api.defeatOnShipLoss("VKS Skyshard");
		
		// Set up the enemy fleet.
		// It's got more ships than the player's, and are stronger, but hey they are computer controled.
		// api.addToFleet(FleetSide.ENEMY, "onslaught_Reconditioned", FleetMemberType.SHIP, false);
		api.addToFleet(FleetSide.ENEMY, "dominator_Support", FleetMemberType.SHIP, false, CrewXPLevel.REGULAR);
		api.addToFleet(FleetSide.ENEMY, "dominator_Outdated", FleetMemberType.SHIP, false, CrewXPLevel.REGULAR);
		api.addToFleet(FleetSide.ENEMY, "enforcer_CS", FleetMemberType.SHIP, false, CrewXPLevel.REGULAR);
		api.addToFleet(FleetSide.ENEMY, "enforcer_CS", FleetMemberType.SHIP, false, CrewXPLevel.REGULAR);
		api.addToFleet(FleetSide.ENEMY, "enforcer_Outdated", FleetMemberType.SHIP, false, CrewXPLevel.VETERAN);
		api.addToFleet(FleetSide.ENEMY, "enforcer_Outdated", FleetMemberType.SHIP, false, CrewXPLevel.VETERAN);
		api.addToFleet(FleetSide.ENEMY, "condor_FS", FleetMemberType.SHIP, false, CrewXPLevel.ELITE);
		api.addToFleet(FleetSide.ENEMY, "condor_FS", FleetMemberType.SHIP, false, CrewXPLevel.ELITE);
		api.addToFleet(FleetSide.ENEMY, "condor_FS", FleetMemberType.SHIP, false, CrewXPLevel.VETERAN);
		api.addToFleet(FleetSide.ENEMY, "condor_FS", FleetMemberType.SHIP, false, CrewXPLevel.VETERAN);
		api.addToFleet(FleetSide.ENEMY, "condor_FS", FleetMemberType.SHIP, false, CrewXPLevel.VETERAN);
		api.addToFleet(FleetSide.ENEMY, "condor_FS", FleetMemberType.SHIP, false, CrewXPLevel.VETERAN);
		api.addToFleet(FleetSide.ENEMY, "buffalo2_FS", FleetMemberType.SHIP, false, CrewXPLevel.REGULAR);
		api.addToFleet(FleetSide.ENEMY, "buffalo2_FS", FleetMemberType.SHIP, false, CrewXPLevel.REGULAR);
		api.addToFleet(FleetSide.ENEMY, "buffalo2_FS", FleetMemberType.SHIP, false, CrewXPLevel.REGULAR);
		api.addToFleet(FleetSide.ENEMY, "buffalo2_FS", FleetMemberType.SHIP, false, CrewXPLevel.REGULAR);
		api.addToFleet(FleetSide.ENEMY, "lasher_CS", FleetMemberType.SHIP, false, CrewXPLevel.REGULAR);
		api.addToFleet(FleetSide.ENEMY, "lasher_CS", FleetMemberType.SHIP, false, CrewXPLevel.REGULAR);
		api.addToFleet(FleetSide.ENEMY, "lasher_Strike", FleetMemberType.SHIP, false, CrewXPLevel.VETERAN);
		api.addToFleet(FleetSide.ENEMY, "lasher_Strike", FleetMemberType.SHIP, false, CrewXPLevel.VETERAN);
		api.addToFleet(FleetSide.ENEMY, "lasher_Standard", FleetMemberType.SHIP, false, CrewXPLevel.VETERAN);
		api.addToFleet(FleetSide.ENEMY, "lasher_Standard", FleetMemberType.SHIP, false, CrewXPLevel.VETERAN);
		api.addToFleet(FleetSide.ENEMY, "hound_Standard", FleetMemberType.SHIP, false, CrewXPLevel.VETERAN);
		api.addToFleet(FleetSide.ENEMY, "hound_Standard", FleetMemberType.SHIP, false, CrewXPLevel.VETERAN);
		api.addToFleet(FleetSide.ENEMY, "hound_Standard", FleetMemberType.SHIP, false, CrewXPLevel.VETERAN);
		api.addToFleet(FleetSide.ENEMY, "hound_Standard", FleetMemberType.SHIP, false, CrewXPLevel.VETERAN);
		api.addToFleet(FleetSide.ENEMY, "broadsword_wing", FleetMemberType.FIGHTER_WING, false, CrewXPLevel.REGULAR);
		api.addToFleet(FleetSide.ENEMY, "broadsword_wing", FleetMemberType.FIGHTER_WING, false, CrewXPLevel.REGULAR);
		api.addToFleet(FleetSide.ENEMY, "piranha_wing", FleetMemberType.FIGHTER_WING, false, CrewXPLevel.GREEN);
		api.addToFleet(FleetSide.ENEMY, "piranha_wing", FleetMemberType.FIGHTER_WING, false, CrewXPLevel.GREEN);
		api.addToFleet(FleetSide.ENEMY, "piranha_wing", FleetMemberType.FIGHTER_WING, false, CrewXPLevel.GREEN);
		api.addToFleet(FleetSide.ENEMY, "piranha_wing", FleetMemberType.FIGHTER_WING, false, CrewXPLevel.GREEN);
		api.addToFleet(FleetSide.ENEMY, "piranha_wing", FleetMemberType.FIGHTER_WING, false, CrewXPLevel.GREEN);
		api.addToFleet(FleetSide.ENEMY, "piranha_wing", FleetMemberType.FIGHTER_WING, false, CrewXPLevel.GREEN);
		api.addToFleet(FleetSide.ENEMY, "talon_wing", FleetMemberType.FIGHTER_WING, false);
		api.addToFleet(FleetSide.ENEMY, "talon_wing", FleetMemberType.FIGHTER_WING, false);
		api.addToFleet(FleetSide.ENEMY, "talon_wing", FleetMemberType.FIGHTER_WING, false);
		api.addToFleet(FleetSide.ENEMY, "talon_wing", FleetMemberType.FIGHTER_WING, false);
		api.addToFleet(FleetSide.ENEMY, "talon_wing", FleetMemberType.FIGHTER_WING, false);
		api.addToFleet(FleetSide.ENEMY, "talon_wing", FleetMemberType.FIGHTER_WING, false);
		

		
		
		// Set up the map.
		// 12000x8000 is actually somewhat small, making for a faster-paced mission.
		float width = 12000f;
		float height =20000f;
		api.initMap((float)-width/2f, (float)width/2f, (float)-height/2f, (float)height/2f);
		
		float minX = -width/2;
		float minY = -height/2;
		
		// All the addXXX methods take a pair of coordinates followed by data for
		// whatever object is being added.
		
		// Add two big nebula clouds
		api.addNebula(minX + width * 0.5f, minY + height * 0.5f, 2250);
		
		// And a few random ones to spice up the playing field.
		// A similar approach can be used to randomize everything
		// else, including fleet composition.
		for (int i = 0; i < 5; i++) {
			float x = (float) Math.random() * width - width/2;
			float y = (float) Math.random() * height - height/2;
			float radius = 100f + (float) Math.random() * 400f; 
			api.addNebula(x, y, radius);
		}
		
		// Add objectives. These can be captured by each side
		// and provide stat bonuses and extra command points to
		// bring in reinforcements.
		// Reinforcements only matter for large fleets - in this
		// case, assuming a 100 command point battle size,
		// both fleets will be able to deploy fully right away.
		api.addObjective(minX + width * 0.40f, minY + height * 0.50f, 
						 "sensor_array", BattleObjectiveAPI.Importance.NORMAL);
		api.addObjective(minX + width * 0.60f, minY + height * 0.50f, 
						 "comm_relay", BattleObjectiveAPI.Importance.NORMAL);				 
		api.addObjective(minX + width * 0.80f, minY + height * 0.80f, 
						 "nav_buoy", BattleObjectiveAPI.Importance.NORMAL);		
		api.addObjective(minX + width * 0.20f, minY + height * 0.20f, 
						 "nav_buoy", BattleObjectiveAPI.Importance.NORMAL);						 
		
		// Add an asteroid field going diagonally across the
		// battlefield, 2000 pixels wide, with a maximum of 
		// 100 asteroids in it.
		// 20-70 is the range of asteroid speeds.
		//api.addAsteroidField(minY, minY, 25, 12500f,
								//20, 80f, 750);
		
		// Add some planets.  These are defined in data/config/planets.json.
		//api.addPlanet(minX + width * 0.1f, minY + height * 0.1f, 1000f, "barren", 1000f);
	}

}
