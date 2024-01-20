package org.example.behaviorial.state;

public class StopState implements State {
    private Context context;

    public StopState(Context audioPlayer) {
        this.context = audioPlayer;
    }


    @Override
    public void Play() {
        context.setState(new StopState(context));
    }

    @Override
    public void Stop() {
        // do nothing
    }

}
