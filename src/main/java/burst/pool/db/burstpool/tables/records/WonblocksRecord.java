/*
 * This file is generated by jOOQ.
 */
package burst.pool.db.burstpool.tables.records;


import burst.pool.db.burstpool.tables.Wonblocks;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


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
public class WonblocksRecord extends UpdatableRecordImpl<WonblocksRecord> implements Record6<Long, Long, Long, Long, String, Long> {

    private static final long serialVersionUID = -2007463746;

    /**
     * Setter for <code>BURSTPOOL.WONBLOCKS.DB_ID</code>.
     */
    public void setDbId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>BURSTPOOL.WONBLOCKS.DB_ID</code>.
     */
    public Long getDbId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>BURSTPOOL.WONBLOCKS.BLOCKHEIGHT</code>.
     */
    public void setBlockheight(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>BURSTPOOL.WONBLOCKS.BLOCKHEIGHT</code>.
     */
    public Long getBlockheight() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>BURSTPOOL.WONBLOCKS.BLOCKID</code>.
     */
    public void setBlockid(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>BURSTPOOL.WONBLOCKS.BLOCKID</code>.
     */
    public Long getBlockid() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>BURSTPOOL.WONBLOCKS.GENERATORID</code>.
     */
    public void setGeneratorid(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>BURSTPOOL.WONBLOCKS.GENERATORID</code>.
     */
    public Long getGeneratorid() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>BURSTPOOL.WONBLOCKS.NONCE</code>.
     */
    public void setNonce(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>BURSTPOOL.WONBLOCKS.NONCE</code>.
     */
    public String getNonce() {
        return (String) get(4);
    }

    /**
     * Setter for <code>BURSTPOOL.WONBLOCKS.FULLREWARD</code>.
     */
    public void setFullreward(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>BURSTPOOL.WONBLOCKS.FULLREWARD</code>.
     */
    public Long getFullreward() {
        return (Long) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Long, Long, Long, Long, String, Long> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Long, Long, Long, Long, String, Long> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return Wonblocks.WONBLOCKS.DB_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return Wonblocks.WONBLOCKS.BLOCKHEIGHT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return Wonblocks.WONBLOCKS.BLOCKID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return Wonblocks.WONBLOCKS.GENERATORID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Wonblocks.WONBLOCKS.NONCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field6() {
        return Wonblocks.WONBLOCKS.FULLREWARD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getDbId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getBlockheight();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component3() {
        return getBlockid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component4() {
        return getGeneratorid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getNonce();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component6() {
        return getFullreward();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getDbId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getBlockheight();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getBlockid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value4() {
        return getGeneratorid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getNonce();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value6() {
        return getFullreward();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WonblocksRecord value1(Long value) {
        setDbId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WonblocksRecord value2(Long value) {
        setBlockheight(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WonblocksRecord value3(Long value) {
        setBlockid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WonblocksRecord value4(Long value) {
        setGeneratorid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WonblocksRecord value5(String value) {
        setNonce(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WonblocksRecord value6(Long value) {
        setFullreward(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public WonblocksRecord values(Long value1, Long value2, Long value3, Long value4, String value5, Long value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached WonblocksRecord
     */
    public WonblocksRecord() {
        super(Wonblocks.WONBLOCKS);
    }

    /**
     * Create a detached, initialised WonblocksRecord
     */
    public WonblocksRecord(Long dbId, Long blockheight, Long blockid, Long generatorid, String nonce, Long fullreward) {
        super(Wonblocks.WONBLOCKS);

        set(0, dbId);
        set(1, blockheight);
        set(2, blockid);
        set(3, generatorid);
        set(4, nonce);
        set(5, fullreward);
    }
}
