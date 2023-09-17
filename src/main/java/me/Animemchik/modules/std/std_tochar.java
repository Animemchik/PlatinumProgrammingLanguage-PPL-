package me.Animemchik.modules.std;

import me.Animemchik.lib.Arguments;
import me.Animemchik.lib.Function;
import me.Animemchik.lib.StringValue;
import me.Animemchik.lib.Value;

public final class std_tochar implements Function {

    @Override
    public Value execute(Value... args) {
        Arguments.check(1, args.length);
        return new StringValue(String.valueOf((char) args[0].asInteger()));
    }
}
