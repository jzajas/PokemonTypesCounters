package com.zajdsky.typesCounters.Templates;


import java.util.ArrayList;
import java.util.List;

public class Types {

        // Normal
        public static final List<String> normalEffectiveAttack = new ArrayList<>();
        public static final List<String> normalEffectiveDefense = new ArrayList<>();
        public static final List<String> normalWeakAttack = new ArrayList<>(List.of("Rock", "Steel"));
        public static final List<String> normalWeakDefense = new ArrayList<>(List.of("Fighting"));
        public static final List<String> normalImmuneTo = new ArrayList<>();
        public static final List<String> normalCannotDamage = new ArrayList<>(List.of("Ghost"));

        // Fire
        public static final List<String> fireEffectiveAttack = new ArrayList<>(List.of("Grass", "Ice", "Bug", "Steel"));
        public static final List<String> fireEffectiveDefense = new ArrayList<>(List.of("Fire", "Grass", "Ice", "Bug", "Steel", "Fairy"));
        public static final List<String> fireWeakAttack = new ArrayList<>(List.of("Fire", "Water", "Rock", "Dragon"));
        public static final List<String> fireWeakDefense = new ArrayList<>(List.of("Water", "Ground", "Rock"));
        public static final List<String> fireImmuneTo = new ArrayList<>();
        public static final List<String> fireCannotDamage = new ArrayList<>();

        // Water
        public static final List<String> waterEffectiveAttack = new ArrayList<>(List.of("Fire", "Ground", "Rock"));
        public static final List<String> waterEffectiveDefense = new ArrayList<>(List.of("Fire", "Water", "Ice", "Steel"));
        public static final List<String> waterWeakAttack = new ArrayList<>(List.of("Water", "Grass", "Dragon"));
        public static final List<String> waterWeakDefense = new ArrayList<>(List.of("Grass", "Electric"));
        public static final List<String> waterImmuneTo = new ArrayList<>();
        public static final List<String> waterCannotDamage = new ArrayList<>();

        // Electric
        public static final List<String> electricEffectiveAttack = new ArrayList<>(List.of("Water", "Flying"));
        public static final List<String> electricEffectiveDefense = new ArrayList<>(List.of("Electric", "Flying", "Steel"));
        public static final List<String> electricWeakAttack = new ArrayList<>(List.of("Electric", "Grass", "Dragon"));
        public static final List<String> electricWeakDefense = new ArrayList<>(List.of("Ground"));
        public static final List<String> electricImmuneTo = new ArrayList<>();
        public static final List<String> electricCannotDamage = new ArrayList<>(List.of("Ground"));

        // Ground
        public static final List<String> groundEffectiveAttack = new ArrayList<>(List.of("Fire", "Electric", "Poison", "Rock", "Steel"));
        public static final List<String> groundEffectiveDefense = new ArrayList<>(List.of("Poison", "Rock"));
        public static final List<String> groundWeakAttack = new ArrayList<>(List.of("Grass", "Bug"));
        public static final List<String> groundWeakDefense = new ArrayList<>(List.of("Water", "Grass", "Ice"));
        public static final List<String> groundImmuneTo = new ArrayList<>(List.of("Electric"));
        public static final List<String> groundCannotDamage = new ArrayList<>(List.of("Flying"));

        // Grass
        public static final List<String> grassEffectiveAttack = new ArrayList<>(List.of("Water", "Ground", "Rock"));
        public static final List<String> grassEffectiveDefense = new ArrayList<>(List.of("Water", "Electric", "Grass", "Ground"));
        public static final List<String> grassWeakAttack = new ArrayList<>(List.of("Fire", "Grass", "Poison", "Flying", "Bug", "Dragon", "Steel"));
        public static final List<String> grassWeakDefense = new ArrayList<>(List.of("Fire", "Ice", "Poison", "Flying", "Bug"));
        public static final List<String> grassImmuneTo = new ArrayList<>();
        public static final List<String> grassCannotDamage = new ArrayList<>();

        // Ice
        public static final List<String> iceEffectiveAttack = new ArrayList<>(List.of("Grass", "Ground", "Flying", "Dragon"));
        public static final List<String> iceEffectiveDefense = new ArrayList<>(List.of("Ice"));
        public static final List<String> iceWeakAttack = new ArrayList<>(List.of("Fire", "Water", "Ice", "Steel"));
        public static final List<String> iceWeakDefense = new ArrayList<>(List.of("Fire", "Fighting", "Rock", "Steel"));
        public static final List<String> iceImmuneTo = new ArrayList<>();
        public static final List<String> iceCannotDamage = new ArrayList<>();

        // Fighting
        public static final List<String> fightingEffectiveAttack = new ArrayList<>(List.of("Normal", "Ice", "Rock", "Dark", "Steel"));
        public static final List<String> fightingEffectiveDefense = new ArrayList<>(List.of("Bug", "Rock", "Dark"));
        public static final List<String> fightingWeakAttack = new ArrayList<>(List.of("Poison", "Flying", "Psychic", "Bug", "Fairy"));
        public static final List<String> fightingWeakDefense = new ArrayList<>(List.of("Flying", "Psychic", "Fairy"));
        public static final List<String> fightingImmuneTo = new ArrayList<>();
        public static final List<String> fightingCannotDamage = new ArrayList<>(List.of("Ghost"));

        // Poison
        public static final List<String> poisonEffectiveAttack = new ArrayList<>(List.of("Grass", "Fairy"));
        public static final List<String> poisonEffectiveDefense = new ArrayList<>(List.of("Grass", "Fighting", "Poison", "Bug", "Fairy"));
        public static final List<String> poisonWeakAttack = new ArrayList<>(List.of("Poison", "Ground", "Rock", "Ghost"));
        public static final List<String> poisonWeakDefense = new ArrayList<>(List.of("Ground", "Psychic"));
        public static final List<String> poisonImmuneTo = new ArrayList<>();
        public static final List<String> poisonCannotDamage = new ArrayList<>(List.of("Steel"));

        // Flying
        public static final List<String> flyingEffectiveAttack = new ArrayList<>(List.of("Grass", "Fighting", "Bug"));
        public static final List<String> flyingEffectiveDefense = new ArrayList<>(List.of("Grass", "Fighting", "Bug"));
        public static final List<String> flyingWeakAttack = new ArrayList<>(List.of("Electric", "Rock", "Steel"));
        public static final List<String> flyingWeakDefense = new ArrayList<>(List.of("Electric", "Ice", "Rock"));
        public static final List<String> flyingImmuneTo = new ArrayList<>(List.of("Ground"));
        public static final List<String> flyingCannotDamage = new ArrayList<>();

        // Psychic
        public static final List<String> psychicEffectiveAttack = new ArrayList<>(List.of("Fighting", "Poison"));
        public static final List<String> psychicEffectiveDefense = new ArrayList<>(List.of("Fighting", "Psychic"));
        public static final List<String> psychicWeakAttack = new ArrayList<>(List.of("Psychic", "Steel"));
        public static final List<String> psychicWeakDefense = new ArrayList<>(List.of("Bug", "Ghost", "Dark"));
        public static final List<String> psychicImmuneTo = new ArrayList<>();
        public static final List<String> psychicCannotDamage = new ArrayList<>(List.of("Dark"));

        // Bug
        public static final List<String> bugEffectiveAttack = new ArrayList<>(List.of("Grass", "Psychic", "Dark"));
        public static final List<String> bugEffectiveDefense = new ArrayList<>(List.of("Grass", "Fighting", "Ground"));
        public static final List<String> bugWeakAttack = new ArrayList<>(List.of("Fire", "Fighting", "Poison", "Flying", "Ghost", "Steel", "Fairy"));
        public static final List<String> bugWeakDefense = new ArrayList<>(List.of("Fire", "Flying", "Rock"));
        public static final List<String> bugImmuneTo = new ArrayList<>();
        public static final List<String> bugCannotDamage = new ArrayList<>();

        // Rock
        public static final List<String> rockEffectiveAttack = new ArrayList<>(List.of("Fire", "Ice", "Flying", "Bug"));
        public static final List<String> rockEffectiveDefense = new ArrayList<>(List.of("Normal", "Fire", "Poison", "Flying"));
        public static final List<String> rockWeakAttack = new ArrayList<>(List.of("Fighting", "Ground", "Steel"));
        public static final List<String> rockWeakDefense = new ArrayList<>(List.of("Water", "Grass", "Fighting", "Ground", "Steel"));
        public static final List<String> rockImmuneTo = new ArrayList<>();
        public static final List<String> rockCannotDamage = new ArrayList<>();

        // Ghost
        public static final List<String> ghostEffectiveAttack = new ArrayList<>(List.of("Psychic", "Ghost"));
        public static final List<String> ghostEffectiveDefense = new ArrayList<>(List.of("Poison", "Bug"));
        public static final List<String> ghostWeakAttack = new ArrayList<>(List.of("Dark"));
        public static final List<String> ghostWeakDefense = new ArrayList<>(List.of("Ghost", "Dark"));
        public static final List<String> ghostImmuneTo = new ArrayList<>(List.of("Normal", "Fighting"));
        public static final List<String> ghostCannotDamage = new ArrayList<>(List.of("Normal"));

        // Dragon
        public static final List<String> dragonEffectiveAttack = new ArrayList<>(List.of("Dragon"));
        public static final List<String> dragonEffectiveDefense = new ArrayList<>(List.of("Fire", "Water", "Electric", "Grass"));
        public static final List<String> dragonWeakAttack = new ArrayList<>(List.of("Steel"));
        public static final List<String> dragonWeakDefense = new ArrayList<>(List.of("Ice", "Dragon", "Fairy"));
        public static final List<String> dragonImmuneTo = new ArrayList<>(List.of());
        public static final List<String> dragonCannotDamage = new ArrayList<>(List.of("Fairy"));

        // Dark
        public static final List<String> darkEffectiveAttack = new ArrayList<>(List.of("Psychic", "Ghost"));
        public static final List<String> darkEffectiveDefense = new ArrayList<>(List.of("Ghost", "Dark"));
        public static final List<String> darkWeakAttack = new ArrayList<>(List.of("Fighting", "Dark", "Fairy"));
        public static final List<String> darkWeakDefense = new ArrayList<>(List.of("Fighting", "Bug", "Fairy"));
        public static final List<String> darkImmuneTo =  new ArrayList<>(List.of("Psychic"));
        public static final List<String> darkCannotDamage =  new ArrayList<>(List.of());

        // Steel
        public static final List<String> steelEffectiveAttack =  new ArrayList<>(List.of("Ice", "Rock", "Fairy"));
        public static final List<String> steelEffectiveDefense =  new ArrayList<>(List.of("Normal", "Grass", "Ice", "Flying", "Psychic", "Bug", "Rock", "Dragon", "Steel", "Fairy"));
        public static final List<String> steelWeakAttack =  new ArrayList<>(List.of("Fire", "Water", "Electric", "Steel"));
        public static final List<String> steelWeakDefense =  new ArrayList<>(List.of("Fire", "Fighting", "Ground"));
        public static final List<String> steelImmuneTo =  new ArrayList<>(List.of("Poison"));
        public static final List<String> steelCannotDamage =  new ArrayList<>(List.of());

        // Fairy
        public static final List<String> fairyEffectiveAttack =  new ArrayList<>(List.of("Fighting", "Dragon", "Dark"));
        public static final List<String> fairyEffectiveDefense =  new ArrayList<>(List.of("Fighting", "Bug", "Dark"));
        public static final List<String> fairyWeakAttack =  new ArrayList<>(List.of("Fire", "Poison", "Steel"));
        public static final List<String> fairyWeakDefense =  new ArrayList<>(List.of("Poison", "Steel"));
        public static final List<String> fairyImmuneTo =  new ArrayList<>(List.of("Dragon"));
        public static final List<String> fairyCannotDamage =  new ArrayList<>(List.of());
}
