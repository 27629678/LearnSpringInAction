package com.xoyo.knights;

public class DamselRescuingKnight implements Knight {

    private RescueDamselQuest quest;

    public DamselRescuingKnight() {
        this.quest = new RescueDamselQuest();
    }

    @Override
    public void embarkOnQuest() {
        quest.embarkOnQuest();
    }

    public void setQuest(RescueDamselQuest quest) {
        this.quest = quest;
    }

    public RescueDamselQuest getQuest() {
        return this.quest;
    }
}
