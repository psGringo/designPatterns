package org.example.behaviorial.state;

public class PlayState implements State {
    private Context context;

    public PlayState(Context context) {
        this.context = context;
    }

    @Override
    public void Play() {
        // do nothing
    }

    @Override
    public void Stop() {
        context.setState(new StopState(context));
    }
}
