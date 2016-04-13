package com.galvin.interview;

import java.util.Objects;

/**
 * A very simple bug report, with two levels of categorization: severity, 
 * and urgency.
 */
public class BugReport
{
    private String name;
    private String body;
    private Severity severity;
    private Urgency urgency;

    public BugReport() {
    }

    public BugReport( String name, String body, Severity severity, Urgency urgency ) {
        this.name = name;
        this.body = body;
        this.severity = severity;
        this.urgency = urgency;
    }

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public String getBody() {
        return body;
    }

    public void setBody( String body ) {
        this.body = body;
    }

    public Severity getSeverity() {
        return severity;
    }

    public void setSeverity( Severity severity ) {
        this.severity = severity;
    }

    public Urgency getUrgency() {
        return urgency;
    }

    public void setUrgency( Urgency urgency ) {
        this.urgency = urgency;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode( this.name );
        hash = 13 * hash + Objects.hashCode( this.body );
        hash = 13 * hash + Objects.hashCode( this.severity );
        hash = 13 * hash + Objects.hashCode( this.urgency );
        return hash;
    }

    @Override
    public boolean equals( Object obj ) {
        if( obj == null ) {
            return false;
        }
        if( getClass() != obj.getClass() ) {
            return false;
        }
        final BugReport other = (BugReport)obj;
        if( !Objects.equals( this.name, other.name ) ) {
            return false;
        }
        if( !Objects.equals( this.body, other.body ) ) {
            return false;
        }
        if( this.severity != other.severity ) {
            return false;
        }
        if( this.urgency != other.urgency ) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BugReport{" + "name=" + name + ", severity=" + severity + ", urgency=" + urgency + '}';
    }
    
}
