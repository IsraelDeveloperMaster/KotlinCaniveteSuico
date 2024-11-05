package net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomSimples.dataBase;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomOpenHelper;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomSimples.dao.InterfaceDaoRoomSimples;
import net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomSimples.dao.InterfaceDaoRoomSimples_Impl;

@SuppressWarnings({"unchecked", "deprecation"})
public final class BancoDeDadosRoomSimples_Impl extends BancoDeDadosRoomSimples {
  private volatile InterfaceDaoRoomSimples _interfaceDaoRoomSimples;

  @Override
  @NonNull
  protected SupportSQLiteOpenHelper createOpenHelper(@NonNull final DatabaseConfiguration config) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(config, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS `nome_da_tabela` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `Coluna_nome` TEXT NOT NULL, `Coluna_idade` TEXT NOT NULL)");
        db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '92e8021a94aef48b72fde6bd0675f31f')");
      }

      @Override
      public void dropAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("DROP TABLE IF EXISTS `nome_da_tabela`");
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onDestructiveMigration(db);
          }
        }
      }

      @Override
      public void onCreate(@NonNull final SupportSQLiteDatabase db) {
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onCreate(db);
          }
        }
      }

      @Override
      public void onOpen(@NonNull final SupportSQLiteDatabase db) {
        mDatabase = db;
        internalInitInvalidationTracker(db);
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onOpen(db);
          }
        }
      }

      @Override
      public void onPreMigrate(@NonNull final SupportSQLiteDatabase db) {
        DBUtil.dropFtsSyncTriggers(db);
      }

      @Override
      public void onPostMigrate(@NonNull final SupportSQLiteDatabase db) {
      }

      @Override
      @NonNull
      public RoomOpenHelper.ValidationResult onValidateSchema(
          @NonNull final SupportSQLiteDatabase db) {
        final HashMap<String, TableInfo.Column> _columnsNomeDaTabela = new HashMap<String, TableInfo.Column>(3);
        _columnsNomeDaTabela.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNomeDaTabela.put("Coluna_nome", new TableInfo.Column("Coluna_nome", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNomeDaTabela.put("Coluna_idade", new TableInfo.Column("Coluna_idade", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysNomeDaTabela = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesNomeDaTabela = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoNomeDaTabela = new TableInfo("nome_da_tabela", _columnsNomeDaTabela, _foreignKeysNomeDaTabela, _indicesNomeDaTabela);
        final TableInfo _existingNomeDaTabela = TableInfo.read(db, "nome_da_tabela");
        if (!_infoNomeDaTabela.equals(_existingNomeDaTabela)) {
          return new RoomOpenHelper.ValidationResult(false, "nome_da_tabela(net.developermaster.kotlincanivetesuico.ui.bancoDeDados.room.roomSimples.modelEntidade.ModelEntidadeRoomSimples).\n"
                  + " Expected:\n" + _infoNomeDaTabela + "\n"
                  + " Found:\n" + _existingNomeDaTabela);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "92e8021a94aef48b72fde6bd0675f31f", "1e4d30848d355f805620cbb5586a12c2");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(config.context).name(config.name).callback(_openCallback).build();
    final SupportSQLiteOpenHelper _helper = config.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  @NonNull
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    final HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "nome_da_tabela");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `nome_da_tabela`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  @NonNull
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(InterfaceDaoRoomSimples.class, InterfaceDaoRoomSimples_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  @NonNull
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  @NonNull
  public List<Migration> getAutoMigrations(
      @NonNull final Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecs) {
    final List<Migration> _autoMigrations = new ArrayList<Migration>();
    return _autoMigrations;
  }

  @Override
  public InterfaceDaoRoomSimples classeDaoRoomSimples() {
    if (_interfaceDaoRoomSimples != null) {
      return _interfaceDaoRoomSimples;
    } else {
      synchronized(this) {
        if(_interfaceDaoRoomSimples == null) {
          _interfaceDaoRoomSimples = new InterfaceDaoRoomSimples_Impl(this);
        }
        return _interfaceDaoRoomSimples;
      }
    }
  }
}
