package de.lighti.dota2.game;

import java.util.Arrays;

public class Building extends BaseNPC {

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append( "Building [level=" );
        builder.append( level );
        builder.append( ", origin=" );
        builder.append( Arrays.toString( origin ) );
        builder.append( ", alive=" );
        builder.append( alive );
        builder.append( ", blind=" );
        builder.append( blind );
        builder.append( ", dominated=" );
        builder.append( dominated );
        builder.append( ", deniable=" );
        builder.append( deniable );
        builder.append( ", disarmed=" );
        builder.append( disarmed );
        builder.append( ", rooted=" );
        builder.append( rooted );
        builder.append( ", name=" );
        builder.append( name );
        builder.append( ", team=" );
        builder.append( team );
        builder.append( ", attackRange=" );
        builder.append( attackRange );
        builder.append( ", attackTarget=" );
        builder.append( attackTarget );
        builder.append( ", mana=" );
        builder.append( mana );
        builder.append( ", abilities=" );
        builder.append( abilities );
        builder.append( ", health=" );
        builder.append( health );
        builder.append( ", maxHealth=" );
        builder.append( maxHealth );
        builder.append( "]" );
        return builder.toString();
    }

}
