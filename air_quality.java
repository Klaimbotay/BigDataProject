// ORM class for table 'air_quality'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Thu May 11 13:49:44 UTC 2023
// For connector: org.apache.sqoop.manager.PostgresqlManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class air_quality extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        id = (Integer)value;
      }
    });
    setters.put("year", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        year = (Integer)value;
      }
    });
    setters.put("month", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        month = (Integer)value;
      }
    });
    setters.put("day", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        day = (Integer)value;
      }
    });
    setters.put("hour", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        hour = (Integer)value;
      }
    });
    setters.put("pm2.5", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        pm2_5 = (Float)value;
      }
    });
    setters.put("pm10", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        pm10 = (Float)value;
      }
    });
    setters.put("so2", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        so2 = (Float)value;
      }
    });
    setters.put("no2", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        no2 = (Float)value;
      }
    });
    setters.put("co", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        co = (Float)value;
      }
    });
    setters.put("o3", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        o3 = (Float)value;
      }
    });
    setters.put("temp", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        temp = (Float)value;
      }
    });
    setters.put("pres", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        pres = (Float)value;
      }
    });
    setters.put("dewp", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        dewp = (Float)value;
      }
    });
    setters.put("rain", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rain = (Float)value;
      }
    });
    setters.put("wd", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        wd = (String)value;
      }
    });
    setters.put("wspm", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        wspm = (Float)value;
      }
    });
    setters.put("station", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        station = (String)value;
      }
    });
  }
  public air_quality() {
    init0();
  }
  private Integer id;
  public Integer get_id() {
    return id;
  }
  public void set_id(Integer id) {
    this.id = id;
  }
  public air_quality with_id(Integer id) {
    this.id = id;
    return this;
  }
  private Integer year;
  public Integer get_year() {
    return year;
  }
  public void set_year(Integer year) {
    this.year = year;
  }
  public air_quality with_year(Integer year) {
    this.year = year;
    return this;
  }
  private Integer month;
  public Integer get_month() {
    return month;
  }
  public void set_month(Integer month) {
    this.month = month;
  }
  public air_quality with_month(Integer month) {
    this.month = month;
    return this;
  }
  private Integer day;
  public Integer get_day() {
    return day;
  }
  public void set_day(Integer day) {
    this.day = day;
  }
  public air_quality with_day(Integer day) {
    this.day = day;
    return this;
  }
  private Integer hour;
  public Integer get_hour() {
    return hour;
  }
  public void set_hour(Integer hour) {
    this.hour = hour;
  }
  public air_quality with_hour(Integer hour) {
    this.hour = hour;
    return this;
  }
  private Float pm2_5;
  public Float get_pm2_5() {
    return pm2_5;
  }
  public void set_pm2_5(Float pm2_5) {
    this.pm2_5 = pm2_5;
  }
  public air_quality with_pm2_5(Float pm2_5) {
    this.pm2_5 = pm2_5;
    return this;
  }
  private Float pm10;
  public Float get_pm10() {
    return pm10;
  }
  public void set_pm10(Float pm10) {
    this.pm10 = pm10;
  }
  public air_quality with_pm10(Float pm10) {
    this.pm10 = pm10;
    return this;
  }
  private Float so2;
  public Float get_so2() {
    return so2;
  }
  public void set_so2(Float so2) {
    this.so2 = so2;
  }
  public air_quality with_so2(Float so2) {
    this.so2 = so2;
    return this;
  }
  private Float no2;
  public Float get_no2() {
    return no2;
  }
  public void set_no2(Float no2) {
    this.no2 = no2;
  }
  public air_quality with_no2(Float no2) {
    this.no2 = no2;
    return this;
  }
  private Float co;
  public Float get_co() {
    return co;
  }
  public void set_co(Float co) {
    this.co = co;
  }
  public air_quality with_co(Float co) {
    this.co = co;
    return this;
  }
  private Float o3;
  public Float get_o3() {
    return o3;
  }
  public void set_o3(Float o3) {
    this.o3 = o3;
  }
  public air_quality with_o3(Float o3) {
    this.o3 = o3;
    return this;
  }
  private Float temp;
  public Float get_temp() {
    return temp;
  }
  public void set_temp(Float temp) {
    this.temp = temp;
  }
  public air_quality with_temp(Float temp) {
    this.temp = temp;
    return this;
  }
  private Float pres;
  public Float get_pres() {
    return pres;
  }
  public void set_pres(Float pres) {
    this.pres = pres;
  }
  public air_quality with_pres(Float pres) {
    this.pres = pres;
    return this;
  }
  private Float dewp;
  public Float get_dewp() {
    return dewp;
  }
  public void set_dewp(Float dewp) {
    this.dewp = dewp;
  }
  public air_quality with_dewp(Float dewp) {
    this.dewp = dewp;
    return this;
  }
  private Float rain;
  public Float get_rain() {
    return rain;
  }
  public void set_rain(Float rain) {
    this.rain = rain;
  }
  public air_quality with_rain(Float rain) {
    this.rain = rain;
    return this;
  }
  private String wd;
  public String get_wd() {
    return wd;
  }
  public void set_wd(String wd) {
    this.wd = wd;
  }
  public air_quality with_wd(String wd) {
    this.wd = wd;
    return this;
  }
  private Float wspm;
  public Float get_wspm() {
    return wspm;
  }
  public void set_wspm(Float wspm) {
    this.wspm = wspm;
  }
  public air_quality with_wspm(Float wspm) {
    this.wspm = wspm;
    return this;
  }
  private String station;
  public String get_station() {
    return station;
  }
  public void set_station(String station) {
    this.station = station;
  }
  public air_quality with_station(String station) {
    this.station = station;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof air_quality)) {
      return false;
    }
    air_quality that = (air_quality) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.year == null ? that.year == null : this.year.equals(that.year));
    equal = equal && (this.month == null ? that.month == null : this.month.equals(that.month));
    equal = equal && (this.day == null ? that.day == null : this.day.equals(that.day));
    equal = equal && (this.hour == null ? that.hour == null : this.hour.equals(that.hour));
    equal = equal && (this.pm2_5 == null ? that.pm2_5 == null : this.pm2_5.equals(that.pm2_5));
    equal = equal && (this.pm10 == null ? that.pm10 == null : this.pm10.equals(that.pm10));
    equal = equal && (this.so2 == null ? that.so2 == null : this.so2.equals(that.so2));
    equal = equal && (this.no2 == null ? that.no2 == null : this.no2.equals(that.no2));
    equal = equal && (this.co == null ? that.co == null : this.co.equals(that.co));
    equal = equal && (this.o3 == null ? that.o3 == null : this.o3.equals(that.o3));
    equal = equal && (this.temp == null ? that.temp == null : this.temp.equals(that.temp));
    equal = equal && (this.pres == null ? that.pres == null : this.pres.equals(that.pres));
    equal = equal && (this.dewp == null ? that.dewp == null : this.dewp.equals(that.dewp));
    equal = equal && (this.rain == null ? that.rain == null : this.rain.equals(that.rain));
    equal = equal && (this.wd == null ? that.wd == null : this.wd.equals(that.wd));
    equal = equal && (this.wspm == null ? that.wspm == null : this.wspm.equals(that.wspm));
    equal = equal && (this.station == null ? that.station == null : this.station.equals(that.station));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof air_quality)) {
      return false;
    }
    air_quality that = (air_quality) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.year == null ? that.year == null : this.year.equals(that.year));
    equal = equal && (this.month == null ? that.month == null : this.month.equals(that.month));
    equal = equal && (this.day == null ? that.day == null : this.day.equals(that.day));
    equal = equal && (this.hour == null ? that.hour == null : this.hour.equals(that.hour));
    equal = equal && (this.pm2_5 == null ? that.pm2_5 == null : this.pm2_5.equals(that.pm2_5));
    equal = equal && (this.pm10 == null ? that.pm10 == null : this.pm10.equals(that.pm10));
    equal = equal && (this.so2 == null ? that.so2 == null : this.so2.equals(that.so2));
    equal = equal && (this.no2 == null ? that.no2 == null : this.no2.equals(that.no2));
    equal = equal && (this.co == null ? that.co == null : this.co.equals(that.co));
    equal = equal && (this.o3 == null ? that.o3 == null : this.o3.equals(that.o3));
    equal = equal && (this.temp == null ? that.temp == null : this.temp.equals(that.temp));
    equal = equal && (this.pres == null ? that.pres == null : this.pres.equals(that.pres));
    equal = equal && (this.dewp == null ? that.dewp == null : this.dewp.equals(that.dewp));
    equal = equal && (this.rain == null ? that.rain == null : this.rain.equals(that.rain));
    equal = equal && (this.wd == null ? that.wd == null : this.wd.equals(that.wd));
    equal = equal && (this.wspm == null ? that.wspm == null : this.wspm.equals(that.wspm));
    equal = equal && (this.station == null ? that.station == null : this.station.equals(that.station));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.year = JdbcWritableBridge.readInteger(2, __dbResults);
    this.month = JdbcWritableBridge.readInteger(3, __dbResults);
    this.day = JdbcWritableBridge.readInteger(4, __dbResults);
    this.hour = JdbcWritableBridge.readInteger(5, __dbResults);
    this.pm2_5 = JdbcWritableBridge.readFloat(6, __dbResults);
    this.pm10 = JdbcWritableBridge.readFloat(7, __dbResults);
    this.so2 = JdbcWritableBridge.readFloat(8, __dbResults);
    this.no2 = JdbcWritableBridge.readFloat(9, __dbResults);
    this.co = JdbcWritableBridge.readFloat(10, __dbResults);
    this.o3 = JdbcWritableBridge.readFloat(11, __dbResults);
    this.temp = JdbcWritableBridge.readFloat(12, __dbResults);
    this.pres = JdbcWritableBridge.readFloat(13, __dbResults);
    this.dewp = JdbcWritableBridge.readFloat(14, __dbResults);
    this.rain = JdbcWritableBridge.readFloat(15, __dbResults);
    this.wd = JdbcWritableBridge.readString(16, __dbResults);
    this.wspm = JdbcWritableBridge.readFloat(17, __dbResults);
    this.station = JdbcWritableBridge.readString(18, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.id = JdbcWritableBridge.readInteger(1, __dbResults);
    this.year = JdbcWritableBridge.readInteger(2, __dbResults);
    this.month = JdbcWritableBridge.readInteger(3, __dbResults);
    this.day = JdbcWritableBridge.readInteger(4, __dbResults);
    this.hour = JdbcWritableBridge.readInteger(5, __dbResults);
    this.pm2_5 = JdbcWritableBridge.readFloat(6, __dbResults);
    this.pm10 = JdbcWritableBridge.readFloat(7, __dbResults);
    this.so2 = JdbcWritableBridge.readFloat(8, __dbResults);
    this.no2 = JdbcWritableBridge.readFloat(9, __dbResults);
    this.co = JdbcWritableBridge.readFloat(10, __dbResults);
    this.o3 = JdbcWritableBridge.readFloat(11, __dbResults);
    this.temp = JdbcWritableBridge.readFloat(12, __dbResults);
    this.pres = JdbcWritableBridge.readFloat(13, __dbResults);
    this.dewp = JdbcWritableBridge.readFloat(14, __dbResults);
    this.rain = JdbcWritableBridge.readFloat(15, __dbResults);
    this.wd = JdbcWritableBridge.readString(16, __dbResults);
    this.wspm = JdbcWritableBridge.readFloat(17, __dbResults);
    this.station = JdbcWritableBridge.readString(18, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(id, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(year, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(month, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(day, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(hour, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeFloat(pm2_5, 6 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeFloat(pm10, 7 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeFloat(so2, 8 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeFloat(no2, 9 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeFloat(co, 10 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeFloat(o3, 11 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeFloat(temp, 12 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeFloat(pres, 13 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeFloat(dewp, 14 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeFloat(rain, 15 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeString(wd, 16 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeFloat(wspm, 17 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeString(station, 18 + __off, 12, __dbStmt);
    return 18;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(id, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(year, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(month, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(day, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(hour, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeFloat(pm2_5, 6 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeFloat(pm10, 7 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeFloat(so2, 8 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeFloat(no2, 9 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeFloat(co, 10 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeFloat(o3, 11 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeFloat(temp, 12 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeFloat(pres, 13 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeFloat(dewp, 14 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeFloat(rain, 15 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeString(wd, 16 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeFloat(wspm, 17 + __off, 7, __dbStmt);
    JdbcWritableBridge.writeString(station, 18 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.id = null;
    } else {
    this.id = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.year = null;
    } else {
    this.year = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.month = null;
    } else {
    this.month = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.day = null;
    } else {
    this.day = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.hour = null;
    } else {
    this.hour = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.pm2_5 = null;
    } else {
    this.pm2_5 = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.pm10 = null;
    } else {
    this.pm10 = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.so2 = null;
    } else {
    this.so2 = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.no2 = null;
    } else {
    this.no2 = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.co = null;
    } else {
    this.co = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.o3 = null;
    } else {
    this.o3 = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.temp = null;
    } else {
    this.temp = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.pres = null;
    } else {
    this.pres = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.dewp = null;
    } else {
    this.dewp = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.rain = null;
    } else {
    this.rain = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.wd = null;
    } else {
    this.wd = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.wspm = null;
    } else {
    this.wspm = Float.valueOf(__dataIn.readFloat());
    }
    if (__dataIn.readBoolean()) { 
        this.station = null;
    } else {
    this.station = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.id);
    }
    if (null == this.year) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.year);
    }
    if (null == this.month) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.month);
    }
    if (null == this.day) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.day);
    }
    if (null == this.hour) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.hour);
    }
    if (null == this.pm2_5) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.pm2_5);
    }
    if (null == this.pm10) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.pm10);
    }
    if (null == this.so2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.so2);
    }
    if (null == this.no2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.no2);
    }
    if (null == this.co) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.co);
    }
    if (null == this.o3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.o3);
    }
    if (null == this.temp) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.temp);
    }
    if (null == this.pres) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.pres);
    }
    if (null == this.dewp) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.dewp);
    }
    if (null == this.rain) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.rain);
    }
    if (null == this.wd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, wd);
    }
    if (null == this.wspm) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.wspm);
    }
    if (null == this.station) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, station);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.id);
    }
    if (null == this.year) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.year);
    }
    if (null == this.month) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.month);
    }
    if (null == this.day) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.day);
    }
    if (null == this.hour) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.hour);
    }
    if (null == this.pm2_5) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.pm2_5);
    }
    if (null == this.pm10) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.pm10);
    }
    if (null == this.so2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.so2);
    }
    if (null == this.no2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.no2);
    }
    if (null == this.co) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.co);
    }
    if (null == this.o3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.o3);
    }
    if (null == this.temp) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.temp);
    }
    if (null == this.pres) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.pres);
    }
    if (null == this.dewp) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.dewp);
    }
    if (null == this.rain) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.rain);
    }
    if (null == this.wd) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, wd);
    }
    if (null == this.wspm) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeFloat(this.wspm);
    }
    if (null == this.station) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, station);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(id==null?"null":"" + id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(year==null?"null":"" + year, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(month==null?"null":"" + month, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(day==null?"null":"" + day, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hour==null?"null":"" + hour, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(pm2_5==null?"null":"" + pm2_5, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(pm10==null?"null":"" + pm10, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(so2==null?"null":"" + so2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(no2==null?"null":"" + no2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(co==null?"null":"" + co, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(o3==null?"null":"" + o3, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(temp==null?"null":"" + temp, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(pres==null?"null":"" + pres, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(dewp==null?"null":"" + dewp, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(rain==null?"null":"" + rain, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(wd==null?"null":wd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(wspm==null?"null":"" + wspm, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(station==null?"null":station, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(id==null?"null":"" + id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(year==null?"null":"" + year, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(month==null?"null":"" + month, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(day==null?"null":"" + day, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hour==null?"null":"" + hour, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(pm2_5==null?"null":"" + pm2_5, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(pm10==null?"null":"" + pm10, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(so2==null?"null":"" + so2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(no2==null?"null":"" + no2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(co==null?"null":"" + co, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(o3==null?"null":"" + o3, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(temp==null?"null":"" + temp, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(pres==null?"null":"" + pres, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(dewp==null?"null":"" + dewp, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(rain==null?"null":"" + rain, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(wd==null?"null":wd, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(wspm==null?"null":"" + wspm, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(station==null?"null":station, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.id = null; } else {
      this.id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.year = null; } else {
      this.year = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.month = null; } else {
      this.month = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.day = null; } else {
      this.day = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.hour = null; } else {
      this.hour = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.pm2_5 = null; } else {
      this.pm2_5 = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.pm10 = null; } else {
      this.pm10 = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.so2 = null; } else {
      this.so2 = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.no2 = null; } else {
      this.no2 = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.co = null; } else {
      this.co = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.o3 = null; } else {
      this.o3 = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.temp = null; } else {
      this.temp = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.pres = null; } else {
      this.pres = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.dewp = null; } else {
      this.dewp = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.rain = null; } else {
      this.rain = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.wd = null; } else {
      this.wd = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.wspm = null; } else {
      this.wspm = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.station = null; } else {
      this.station = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.id = null; } else {
      this.id = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.year = null; } else {
      this.year = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.month = null; } else {
      this.month = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.day = null; } else {
      this.day = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.hour = null; } else {
      this.hour = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.pm2_5 = null; } else {
      this.pm2_5 = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.pm10 = null; } else {
      this.pm10 = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.so2 = null; } else {
      this.so2 = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.no2 = null; } else {
      this.no2 = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.co = null; } else {
      this.co = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.o3 = null; } else {
      this.o3 = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.temp = null; } else {
      this.temp = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.pres = null; } else {
      this.pres = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.dewp = null; } else {
      this.dewp = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.rain = null; } else {
      this.rain = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.wd = null; } else {
      this.wd = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.wspm = null; } else {
      this.wspm = Float.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.station = null; } else {
      this.station = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    air_quality o = (air_quality) super.clone();
    return o;
  }

  public void clone0(air_quality o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("year", this.year);
    __sqoop$field_map.put("month", this.month);
    __sqoop$field_map.put("day", this.day);
    __sqoop$field_map.put("hour", this.hour);
    __sqoop$field_map.put("pm2.5", this.pm2_5);
    __sqoop$field_map.put("pm10", this.pm10);
    __sqoop$field_map.put("so2", this.so2);
    __sqoop$field_map.put("no2", this.no2);
    __sqoop$field_map.put("co", this.co);
    __sqoop$field_map.put("o3", this.o3);
    __sqoop$field_map.put("temp", this.temp);
    __sqoop$field_map.put("pres", this.pres);
    __sqoop$field_map.put("dewp", this.dewp);
    __sqoop$field_map.put("rain", this.rain);
    __sqoop$field_map.put("wd", this.wd);
    __sqoop$field_map.put("wspm", this.wspm);
    __sqoop$field_map.put("station", this.station);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("year", this.year);
    __sqoop$field_map.put("month", this.month);
    __sqoop$field_map.put("day", this.day);
    __sqoop$field_map.put("hour", this.hour);
    __sqoop$field_map.put("pm2.5", this.pm2_5);
    __sqoop$field_map.put("pm10", this.pm10);
    __sqoop$field_map.put("so2", this.so2);
    __sqoop$field_map.put("no2", this.no2);
    __sqoop$field_map.put("co", this.co);
    __sqoop$field_map.put("o3", this.o3);
    __sqoop$field_map.put("temp", this.temp);
    __sqoop$field_map.put("pres", this.pres);
    __sqoop$field_map.put("dewp", this.dewp);
    __sqoop$field_map.put("rain", this.rain);
    __sqoop$field_map.put("wd", this.wd);
    __sqoop$field_map.put("wspm", this.wspm);
    __sqoop$field_map.put("station", this.station);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
