package SystemDesign.class21.Memento;

import java.time.LocalDateTime;
import java.util.Date;

public class EditorMemento {
  private   String text;
  private   int curserX;
  private   int curserY;
  private   int fontSize;
  private   String fontFamily;
  private   LocalDateTime moment;

    public EditorMemento(String text, int curserX, int curserY, int fontSize, String fontFamily) {
        this.text = text;
        this.curserX = curserX;
        this.curserY = curserY;
        this.fontSize = fontSize;
        this.fontFamily = fontFamily;
        this.moment = LocalDateTime.now();
    }

    public String getText() {
        return text;
    }

    public int getCurserX() {
        return curserX;
    }

    public int getCurserY() {
        return curserY;
    }

    public int getFontSize() {
        return fontSize;
    }

    public String getFontFamily() {
        return fontFamily;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    @Override
    public String toString() {
        return "EditorMemento{" +
                "text='" + text + '\'' +
                ", curserX=" + curserX +
                ", curserY=" + curserY +
                ", fontSize=" + fontSize +
                ", fontFamily='" + fontFamily + '\'' +
                ", moment=" + moment +
                '}';
    }
}
