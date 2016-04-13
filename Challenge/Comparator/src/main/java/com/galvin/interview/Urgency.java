package com.galvin.interview;

/**
 * Represents how quickly a bug must be worked off.
 * 
 * Nice-to-have bugs can be fixed whenever time allows.
 * Should-have bugs are important, but not critical.
 * Must-have bugs must be completed for successful delivery of the software.
 * Fix-Immediately bugs should be worked off as soon as possible.
 */
public enum Urgency
{
    NiceToHave,
    ShouldHave,
    MustHave,
    fixImmediately
}
