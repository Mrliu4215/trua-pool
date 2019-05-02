/*
 * This file is generated by jOOQ.
 */
package burst.pool.migrator.db.tables;


import burst.pool.migrator.db.Indexes;
import burst.pool.migrator.db.Keys;
import burst.pool.migrator.db.Pooldb;
import burst.pool.migrator.db.tables.records.WonblocksRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.util.Arrays;
import java.util.List;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Wonblocks extends TableImpl<WonblocksRecord> {

    private static final long serialVersionUID = -629545991;

    /**
     * The reference instance of <code>pooldb.wonblocks</code>
     */
    public static final Wonblocks WONBLOCKS = new Wonblocks();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<WonblocksRecord> getRecordType() {
        return WonblocksRecord.class;
    }

    /**
     * The column <code>pooldb.wonblocks.db_id</code>.
     */
    public final TableField<WonblocksRecord, Long> DB_ID = createField("db_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>pooldb.wonblocks.blockHeight</code>.
     */
    public final TableField<WonblocksRecord, Long> BLOCKHEIGHT = createField("blockHeight", org.jooq.impl.SQLDataType.BIGINT.defaultValue(DSL.field("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>pooldb.wonblocks.blockId</code>.
     */
    public final TableField<WonblocksRecord, Long> BLOCKID = createField("blockId", org.jooq.impl.SQLDataType.BIGINT.defaultValue(DSL.field("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>pooldb.wonblocks.generatorId</code>.
     */
    public final TableField<WonblocksRecord, Long> GENERATORID = createField("generatorId", org.jooq.impl.SQLDataType.BIGINT.defaultValue(DSL.field("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>pooldb.wonblocks.nonce</code>.
     */
    public final TableField<WonblocksRecord, String> NONCE = createField("nonce", org.jooq.impl.SQLDataType.CLOB.defaultValue(DSL.field("NULL", org.jooq.impl.SQLDataType.CLOB)), this, "");

    /**
     * The column <code>pooldb.wonblocks.fullReward</code>.
     */
    public final TableField<WonblocksRecord, Long> FULLREWARD = createField("fullReward", org.jooq.impl.SQLDataType.BIGINT.defaultValue(DSL.field("NULL", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * Create a <code>pooldb.wonblocks</code> table reference
     */
    public Wonblocks() {
        this(DSL.name("wonblocks"), null);
    }

    /**
     * Create an aliased <code>pooldb.wonblocks</code> table reference
     */
    public Wonblocks(String alias) {
        this(DSL.name(alias), WONBLOCKS);
    }

    /**
     * Create an aliased <code>pooldb.wonblocks</code> table reference
     */
    public Wonblocks(Name alias) {
        this(alias, WONBLOCKS);
    }

    private Wonblocks(Name alias, Table<WonblocksRecord> aliased) {
        this(alias, aliased, null);
    }

    private Wonblocks(Name alias, Table<WonblocksRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Wonblocks(Table<O> child, ForeignKey<O, WonblocksRecord> key) {
        super(child, key, WONBLOCKS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Pooldb.POOLDB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.WONBLOCKS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<WonblocksRecord, Long> getIdentity() {
        return Keys.IDENTITY_WONBLOCKS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<WonblocksRecord> getPrimaryKey() {
        return Keys.KEY_WONBLOCKS_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<WonblocksRecord>> getKeys() {
        return Arrays.<UniqueKey<WonblocksRecord>>asList(Keys.KEY_WONBLOCKS_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Wonblocks as(String alias) {
        return new Wonblocks(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Wonblocks as(Name alias) {
        return new Wonblocks(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Wonblocks rename(String name) {
        return new Wonblocks(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Wonblocks rename(Name name) {
        return new Wonblocks(name, null);
    }
}
