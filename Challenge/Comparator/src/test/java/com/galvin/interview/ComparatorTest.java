package com.galvin.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class ComparatorTest
{
    @Test
    public void testSeveritySort() throws Exception {
        BugReport worldEnding = new BugReport( "World-Ending bug", "Everything is on fire and I think I'm going to die.", Severity.WorldEnding, Urgency.MustHave );
        BugReport large = new BugReport( "Large bug", "Well this sucks.", Severity.Large, Urgency.MustHave );
        BugReport medium = new BugReport( "Medium bug", "Oh bother.", Severity.Medium, Urgency.MustHave );
        BugReport low = new BugReport( "Low bug", "Eh.", Severity.Small, Urgency.MustHave );
        
        List<BugReport> expected = new ArrayList();
        expected.add( worldEnding );
        expected.add( large );
        expected.add( medium );
        expected.add( low );
        
        List<BugReport> input = new ArrayList();
        input.addAll( expected );
        Collections.shuffle( input );
        
        Collections.sort( input, new BugReportComparator() );
        Assert.assertEquals( "Sort by severity failed", expected, input );
    }
    
    @Test
    public void testNullSort() throws Exception {
        BugReport worldEnding = new BugReport( "World-Ending bug", "Everything is on fire and I think I'm going to die.", Severity.WorldEnding, Urgency.MustHave );
        BugReport large = new BugReport( "Large bug", "Well this sucks.", Severity.Large, Urgency.MustHave );
        BugReport medium = new BugReport( "Medium bug", "Oh bother.", Severity.Medium, Urgency.MustHave );
        BugReport low = new BugReport( "Low bug", "Eh.", Severity.Small, Urgency.MustHave );
        
        List<BugReport> expected = new ArrayList();
        expected.add( worldEnding );
        expected.add( large );
        expected.add( medium );
        expected.add( low );
        expected.add( null );
        expected.add( null );
        expected.add( null );
        expected.add( null );
        expected.add( null );
        expected.add( null );
        expected.add( null );
        expected.add( null );
        expected.add( null );
        
        List<BugReport> input = new ArrayList();
        input.addAll( expected );
        Collections.shuffle( input );
        
        Collections.sort( input, new BugReportComparator() );
        Assert.assertEquals( "Sort by severity failed", expected, input );
    }
    
    @Test
    public void testSeveritySortWithNull() throws Exception {
        BugReport worldEnding = new BugReport( "World-Ending bug", "Everything is on fire and I think I'm going to die.", Severity.WorldEnding, Urgency.MustHave );
        BugReport large = new BugReport( "Large bug", "Well this sucks.", Severity.Large, Urgency.MustHave );
        BugReport medium = new BugReport( "Medium bug", "Oh bother.", Severity.Medium, Urgency.MustHave );
        BugReport low = new BugReport( "Low bug", "Eh.", Severity.Small, Urgency.MustHave );
        BugReport nil = new BugReport( "Nil bug", "...", null, Urgency.MustHave );
        
        List<BugReport> expected = new ArrayList();
        expected.add( worldEnding );
        expected.add( large );
        expected.add( medium );
        expected.add( low );
        expected.add( nil );
        
        List<BugReport> input = new ArrayList();
        input.addAll( expected );
        Collections.shuffle( input );
        
        Collections.sort( input, new BugReportComparator() );
        Assert.assertEquals( "Sort by severity failed", expected, input );
    }
    
    @Test
    public void testUrgencySort() throws Exception {
        BugReport fixNow = new BugReport( "World-Ending bug", "Everything is on fire and I think I'm going to die.", Severity.Medium, Urgency.fixImmediately );
        BugReport mustHave = new BugReport( "Large bug", "Well this sucks.", Severity.Medium, Urgency.MustHave );
        BugReport shouldHave = new BugReport( "Medium bug", "Oh bother.", Severity.Medium, Urgency.ShouldHave );
        BugReport niceToHave = new BugReport( "Low bug", "Eh.", Severity.Medium, Urgency.NiceToHave );
        
        List<BugReport> expected = new ArrayList();
        expected.add( fixNow );
        expected.add( mustHave );
        expected.add( shouldHave );
        expected.add( niceToHave );
        
        List<BugReport> input = new ArrayList();
        input.addAll( expected );
        Collections.shuffle( input );
        
        Collections.sort( input, new BugReportComparator() );
        Assert.assertEquals( "Sort by severity failed", expected, input );
    }
    
    @Test
    public void testUrgencySortWithNull() throws Exception {
        BugReport fixNow = new BugReport( "World-Ending bug", "Everything is on fire and I think I'm going to die.", Severity.Medium, Urgency.fixImmediately );
        BugReport mustHave = new BugReport( "Large bug", "Well this sucks.", Severity.Medium, Urgency.MustHave );
        BugReport shouldHave = new BugReport( "Medium bug", "Oh bother.", Severity.Medium, Urgency.ShouldHave );
        BugReport niceToHave = new BugReport( "Low bug", "Eh.", Severity.Medium, Urgency.NiceToHave );
        BugReport nil = new BugReport( "Nil bug", "...", Severity.Medium, null );
        
        List<BugReport> expected = new ArrayList();
        expected.add( fixNow );
        expected.add( mustHave );
        expected.add( shouldHave );
        expected.add( niceToHave );
        expected.add( nil );
        
        List<BugReport> input = new ArrayList();
        input.addAll( expected );
        Collections.shuffle( input );
        
        Collections.sort( input, new BugReportComparator() );
        Assert.assertEquals( "Sort by severity failed", expected, input );
    }
    
    @Test
    public void testSeverityAndUrgencySort() throws Exception {
        BugReport worldEndingFixNow = new BugReport( "World-Ending bug", "Everything is on fire and I think I'm going to die.", Severity.WorldEnding, Urgency.fixImmediately );
        BugReport worldEndingMustHave = new BugReport( "World-Ending bug", "Everything is on fire and I think I'm going to die.", Severity.WorldEnding, Urgency.MustHave );
        BugReport worldEndingShouldHave = new BugReport( "World-Ending bug", "Everything is on fire and I think I'm going to die.", Severity.WorldEnding, Urgency.ShouldHave );
        BugReport worldEndingNiceToHave = new BugReport( "World-Ending bug", "Everything is on fire and I think I'm going to die.", Severity.WorldEnding, Urgency.NiceToHave );
        
        BugReport largeFixNow = new BugReport( "Large bug", "Well this sucks.", Severity.Large, Urgency.fixImmediately );
        BugReport largeMustHave = new BugReport( "Large bug", "Well this sucks.", Severity.Large, Urgency.MustHave );
        BugReport largeShouldHave = new BugReport( "Large bug", "Well this sucks.", Severity.Large, Urgency.ShouldHave );
        BugReport largeNiceToHave = new BugReport( "Large bug", "Well this sucks.", Severity.Large, Urgency.NiceToHave );
        
        BugReport mediumFixNow = new BugReport( "Medium bug", "Oh bother.", Severity.Medium, Urgency.fixImmediately );
        BugReport mediumMustHave = new BugReport( "Medium bug", "Oh bother.", Severity.Medium, Urgency.MustHave );
        BugReport mediumShouldHave = new BugReport( "Medium bug", "Oh bother.", Severity.Medium, Urgency.ShouldHave );
        BugReport mediumNiceToHave = new BugReport( "Medium bug", "Oh bother.", Severity.Medium, Urgency.NiceToHave );
        
        BugReport lowFixNow = new BugReport( "Low bug", "Eh.", Severity.Small, Urgency.fixImmediately );
        BugReport lowMustHave = new BugReport( "Low bug", "Eh.", Severity.Small, Urgency.MustHave );
        BugReport lowShouldHave = new BugReport( "Low bug", "Eh.", Severity.Small, Urgency.ShouldHave );
        BugReport lowNiceToHave = new BugReport( "Low bug", "Eh.", Severity.Small, Urgency.NiceToHave );
        
        List<BugReport> expected = new ArrayList();
        expected.add( worldEndingFixNow );
        expected.add( worldEndingMustHave );
        expected.add( worldEndingShouldHave );
        expected.add( worldEndingNiceToHave );
        
        expected.add( largeFixNow );
        expected.add( largeMustHave );
        expected.add( largeShouldHave );
        expected.add( largeNiceToHave );
        
        expected.add( mediumFixNow );
        expected.add( mediumMustHave );
        expected.add( mediumShouldHave );
        expected.add( mediumNiceToHave );
        
        expected.add( lowFixNow );
        expected.add( lowMustHave );
        expected.add( lowShouldHave );
        expected.add( lowNiceToHave );
        
        List<BugReport> input = new ArrayList();
        input.addAll( expected );
        Collections.shuffle( input );
        
        Collections.sort( input, new BugReportComparator() );
        Assert.assertEquals( "Sort by severity failed", expected, input );
    }
    
    @Test
    public void testSeverityAndUrgencySortWithNull() throws Exception {
        BugReport worldEndingFixNow = new BugReport( "World-Ending bug", "Everything is on fire and I think I'm going to die.", Severity.WorldEnding, Urgency.fixImmediately );
        BugReport worldEndingMustHave = new BugReport( "World-Ending bug", "Everything is on fire and I think I'm going to die.", Severity.WorldEnding, Urgency.MustHave );
        BugReport worldEndingShouldHave = new BugReport( "World-Ending bug", "Everything is on fire and I think I'm going to die.", Severity.WorldEnding, Urgency.ShouldHave );
        BugReport worldEndingNiceToHave = new BugReport( "World-Ending bug", "Everything is on fire and I think I'm going to die.", Severity.WorldEnding, Urgency.NiceToHave );
        BugReport worldEndingNull = new BugReport( "World-Ending bug", "Everything is on fire and I think I'm going to die.", Severity.WorldEnding, null );
        
        BugReport largeFixNow = new BugReport( "Large bug", "Well this sucks.", Severity.Large, Urgency.fixImmediately );
        BugReport largeMustHave = new BugReport( "Large bug", "Well this sucks.", Severity.Large, Urgency.MustHave );
        BugReport largeShouldHave = new BugReport( "Large bug", "Well this sucks.", Severity.Large, Urgency.ShouldHave );
        BugReport largeNiceToHave = new BugReport( "Large bug", "Well this sucks.", Severity.Large, Urgency.NiceToHave );
        BugReport largeNull = new BugReport( "Large bug", "Well this sucks.", Severity.Large, null );
        
        BugReport mediumFixNow = new BugReport( "Medium bug", "Oh bother.", Severity.Medium, Urgency.fixImmediately );
        BugReport mediumMustHave = new BugReport( "Medium bug", "Oh bother.", Severity.Medium, Urgency.MustHave );
        BugReport mediumShouldHave = new BugReport( "Medium bug", "Oh bother.", Severity.Medium, Urgency.ShouldHave );
        BugReport mediumNiceToHave = new BugReport( "Medium bug", "Oh bother.", Severity.Medium, Urgency.NiceToHave );
        BugReport mediumNull = new BugReport( "Medium bug", "Oh bother.", Severity.Medium, null );
        
        BugReport lowFixNow = new BugReport( "Low bug", "Eh.", Severity.Small, Urgency.fixImmediately );
        BugReport lowMustHave = new BugReport( "Low bug", "Eh.", Severity.Small, Urgency.MustHave );
        BugReport lowShouldHave = new BugReport( "Low bug", "Eh.", Severity.Small, Urgency.ShouldHave );
        BugReport lowNiceToHave = new BugReport( "Low bug", "Eh.", Severity.Small, Urgency.NiceToHave );
        BugReport lowNull = new BugReport( "Low bug", "Eh.", Severity.Small, null );
        
        BugReport nullFixNow = new BugReport( "Low bug", "Eh.", null, Urgency.fixImmediately );
        BugReport nullMustHave = new BugReport( "Low bug", "Eh.", null, Urgency.MustHave );
        BugReport nullShouldHave = new BugReport( "Low bug", "Eh.", null, Urgency.ShouldHave );
        BugReport nullNiceToHave = new BugReport( "Low bug", "Eh.", null, Urgency.NiceToHave );
        BugReport nullNull = new BugReport( "Low bug", "Eh.", null, null );
        
        List<BugReport> expected = new ArrayList();
        expected.add( worldEndingFixNow );
        expected.add( worldEndingMustHave );
        expected.add( worldEndingShouldHave );
        expected.add( worldEndingNiceToHave );
        expected.add( worldEndingNull );
        
        expected.add( largeFixNow );
        expected.add( largeMustHave );
        expected.add( largeShouldHave );
        expected.add( largeNiceToHave );
        expected.add( largeNull );
        
        expected.add( mediumFixNow );
        expected.add( mediumMustHave );
        expected.add( mediumShouldHave );
        expected.add( mediumNiceToHave );
        expected.add( mediumNull );
        
        expected.add( lowFixNow );
        expected.add( lowMustHave );
        expected.add( lowShouldHave );
        expected.add( lowNiceToHave );
        expected.add( lowNull );
        
        expected.add( nullFixNow );
        expected.add( nullMustHave );
        expected.add( nullShouldHave );
        expected.add( nullNiceToHave );
        expected.add( nullNull );
        
        List<BugReport> input = new ArrayList();
        input.addAll( expected );
        Collections.shuffle( input );
        
        Collections.sort( input, new BugReportComparator() );
        Assert.assertEquals( "Sort by severity failed", expected, input );
    }
    
    @Test
    public void testSeverityAndUrgencyWithDuplicatesSort() throws Exception {
        BugReport worldEndingFixNow = new BugReport( "World-Ending bug", "Everything is on fire and I think I'm going to die.", Severity.WorldEnding, Urgency.fixImmediately );
        BugReport worldEndingMustHave = new BugReport( "World-Ending bug", "Everything is on fire and I think I'm going to die.", Severity.WorldEnding, Urgency.MustHave );
        BugReport worldEndingShouldHave = new BugReport( "World-Ending bug", "Everything is on fire and I think I'm going to die.", Severity.WorldEnding, Urgency.ShouldHave );
        BugReport worldEndingNiceToHave = new BugReport( "World-Ending bug", "Everything is on fire and I think I'm going to die.", Severity.WorldEnding, Urgency.NiceToHave );
        BugReport worldEndingNull = new BugReport( "World-Ending bug", "Everything is on fire and I think I'm going to die.", Severity.WorldEnding, null );
        
        BugReport largeFixNow = new BugReport( "Large bug", "Well this sucks.", Severity.Large, Urgency.fixImmediately );
        BugReport largeMustHave = new BugReport( "Large bug", "Well this sucks.", Severity.Large, Urgency.MustHave );
        BugReport largeShouldHave = new BugReport( "Large bug", "Well this sucks.", Severity.Large, Urgency.ShouldHave );
        BugReport largeNiceToHave = new BugReport( "Large bug", "Well this sucks.", Severity.Large, Urgency.NiceToHave );
        BugReport largeNull = new BugReport( "Large bug", "Well this sucks.", Severity.Large, null );
        
        BugReport mediumFixNow = new BugReport( "Medium bug", "Oh bother.", Severity.Medium, Urgency.fixImmediately );
        BugReport mediumMustHave = new BugReport( "Medium bug", "Oh bother.", Severity.Medium, Urgency.MustHave );
        BugReport mediumShouldHave = new BugReport( "Medium bug", "Oh bother.", Severity.Medium, Urgency.ShouldHave );
        BugReport mediumNiceToHave = new BugReport( "Medium bug", "Oh bother.", Severity.Medium, Urgency.NiceToHave );
        BugReport mediumNull = new BugReport( "Medium bug", "Oh bother.", Severity.Medium, null );
        
        BugReport lowFixNow = new BugReport( "Low bug", "Eh.", Severity.Small, Urgency.fixImmediately );
        BugReport lowMustHave = new BugReport( "Low bug", "Eh.", Severity.Small, Urgency.MustHave );
        BugReport lowShouldHave = new BugReport( "Low bug", "Eh.", Severity.Small, Urgency.ShouldHave );
        BugReport lowNiceToHave = new BugReport( "Low bug", "Eh.", Severity.Small, Urgency.NiceToHave );
        BugReport lowNull = new BugReport( "Low bug", "Eh.", Severity.Small, null );
        
        BugReport nullFixNow = new BugReport( "Low bug", "Eh.", null, Urgency.fixImmediately );
        BugReport nullMustHave = new BugReport( "Low bug", "Eh.", null, Urgency.MustHave );
        BugReport nullShouldHave = new BugReport( "Low bug", "Eh.", null, Urgency.ShouldHave );
        BugReport nullNiceToHave = new BugReport( "Low bug", "Eh.", null, Urgency.NiceToHave );
        BugReport nullNull = new BugReport( "Low bug", "Eh.", null, null );
        
        List<BugReport> expected = new ArrayList();
        expected.add( worldEndingFixNow );
        expected.add( worldEndingFixNow );
        expected.add( worldEndingMustHave );
        expected.add( worldEndingMustHave );
        expected.add( worldEndingShouldHave );
        expected.add( worldEndingShouldHave );
        expected.add( worldEndingNiceToHave );
        expected.add( worldEndingNiceToHave );
        expected.add( worldEndingNull );
        expected.add( worldEndingNull );
        
        expected.add( largeFixNow );
        expected.add( largeFixNow );
        expected.add( largeMustHave );
        expected.add( largeMustHave );
        expected.add( largeShouldHave );
        expected.add( largeShouldHave );
        expected.add( largeNiceToHave );
        expected.add( largeNiceToHave );
        expected.add( largeNull );
        expected.add( largeNull );
        
        expected.add( mediumFixNow );
        expected.add( mediumFixNow );
        expected.add( mediumMustHave );
        expected.add( mediumMustHave );
        expected.add( mediumShouldHave );
        expected.add( mediumShouldHave );
        expected.add( mediumNiceToHave );
        expected.add( mediumNiceToHave );
        expected.add( mediumNull );
        expected.add( mediumNull );
        
        expected.add( lowFixNow );
        expected.add( lowFixNow );
        expected.add( lowMustHave );
        expected.add( lowMustHave );
        expected.add( lowShouldHave );
        expected.add( lowShouldHave );
        expected.add( lowNiceToHave );
        expected.add( lowNiceToHave );
        expected.add( lowNull );
        expected.add( lowNull );
        
        expected.add( nullFixNow );
        expected.add( nullFixNow );
        expected.add( nullMustHave );
        expected.add( nullMustHave );
        expected.add( nullShouldHave );
        expected.add( nullShouldHave );
        expected.add( nullNiceToHave );
        expected.add( nullNiceToHave );
        expected.add( nullNull );
        expected.add( nullNull );
        
        List<BugReport> input = new ArrayList();
        input.addAll( expected );
        Collections.shuffle( input );
        
        Collections.sort( input, new BugReportComparator() );
        Assert.assertEquals( "Sort by severity failed", expected, input );
    }
}
