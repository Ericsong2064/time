public class Time {
    private int hours;
    private int minutes;
    private int seconds;
    public Time(int hours, int minutes, int seconds){
        this.hours= hours;
        this.minutes= minutes;
        this.seconds = seconds;
    }
    public void add(String time){
       hours += Integer.parseInt(time.substring(0,2));
       minutes += Integer.parseInt(time.substring(3,5));
       seconds += Integer.parseInt(time.substring(6,8));
        if(seconds >= 60) {
            seconds = seconds - 60;
            minutes += 1;
        }
        if(minutes >= 60) {
            minutes = minutes - 60;
            hours += 1;
        }
        if(hours >= 24) {
            hours = hours - 24;
        }
    }
    public void tick(){
        seconds +=1;
        if(seconds >= 60){
            seconds = seconds -60;
            minutes+= 1;
            if(minutes == 60){
                minutes = 0;
                hours += 1;
            }
        }
    }
    public String info(){
        if(hours >= 24){
            hours = 00;
            minutes = 00;
            return (hours + "0:0" + minutes + ":0" + seconds);
        }else if (hours <10 && minutes < 10 && seconds <10){
            return (hours + "0:0" + minutes + ":0" + seconds);
        } else if(minutes < 10 && seconds <10){
            return (hours + ":0" + minutes + ":0" + seconds);
        }else if (hours <10 && seconds <10){
            return ( "0" + hours + ":" + minutes + ":0" + seconds);
        }else if (hours<10 && minutes<10){
            return ( "0" + hours + ":0" + minutes + ":" + seconds);
        }else if (hours <10){
            return ( "0" + hours + ":" + minutes + ":" + seconds);
        } else if(minutes < 10){
            return (hours + ":0" + minutes + ":" + seconds);
        }else if (seconds <10){
            return (hours + ":" + minutes + ":0" + seconds);
        }else{
            return (hours + ":" + minutes + ":" + seconds);
        }
    }
}
