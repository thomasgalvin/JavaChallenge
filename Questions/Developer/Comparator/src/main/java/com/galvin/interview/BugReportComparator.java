package com.galvin.interview;

import java.util.Comparator;

/**
 * This class sorts Bug Reports by severity, then urgency.
 * 
 * Bugs should be sorted according to severity first; e.g. all
 * World-ending bugs come first, then all Large bugs, then all Medium bugs,
 * then all Low bugs, then all bugs without a severity assigned.
 * 
 * Once the bugs have been sorted by severity, they should be sorted by urgency.
 * All Fix-immediately bugs should come first, followed by all Must-haves,
 * followed by all Should-haves, followed by all Nice-to-haves, followed by
 * any bugs that do not have an urgency associated with them.
 */
public class BugReportComparator implements Comparator<BugReport>
{

    @Override
    public int compare( BugReport bugOne, BugReport bugTwo ) {
        throw new UnsupportedOperationException( "TODO: Not implemented yet" );
    }
}
