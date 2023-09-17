package me.Animemchik.modules.std;

import me.Animemchik.lib.Arguments;
import me.Animemchik.lib.Function;
import me.Animemchik.lib.NumberValue;
import me.Animemchik.lib.Value;

public final class std_indexof implements Function {

    @Override
    public Value execute(Value... args) {
        Arguments.checkOrOr(2, 3, args.length);

        final String input = args[0].asString();
        final String what = args[1].asString();
        final int index = (args.length == 3) ? args[2].asInteger() : 0;
        
        return NumberValue.of(input.indexOf(what, index));
    }
}
