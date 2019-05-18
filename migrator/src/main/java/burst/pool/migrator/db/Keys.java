/*
 * This file is generated by jOOQ.
 */
package burst.pool.migrator.db;


import burst.pool.migrator.db.tables.*;
import burst.pool.migrator.db.tables.records.*;
import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;

import javax.annotation.Generated;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code></code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<BestSubmissionsRecord, Long> IDENTITY_BEST_SUBMISSIONS = Identities0.IDENTITY_BEST_SUBMISSIONS;
    public static final Identity<MinersRecord, Long> IDENTITY_MINERS = Identities0.IDENTITY_MINERS;
    public static final Identity<MinerDeadlinesRecord, Long> IDENTITY_MINER_DEADLINES = Identities0.IDENTITY_MINER_DEADLINES;
    public static final Identity<PayoutsRecord, Long> IDENTITY_PAYOUTS = Identities0.IDENTITY_PAYOUTS;
    public static final Identity<WonBlocksRecord, Long> IDENTITY_WON_BLOCKS = Identities0.IDENTITY_WON_BLOCKS;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<BestSubmissionsRecord> KEY_BEST_SUBMISSIONS_PRIMARY = UniqueKeys0.KEY_BEST_SUBMISSIONS_PRIMARY;
    public static final UniqueKey<FlywaySchemaHistoryRecord> KEY_FLYWAY_SCHEMA_HISTORY_PRIMARY = UniqueKeys0.KEY_FLYWAY_SCHEMA_HISTORY_PRIMARY;
    public static final UniqueKey<MinersRecord> KEY_MINERS_PRIMARY = UniqueKeys0.KEY_MINERS_PRIMARY;
    public static final UniqueKey<MinersRecord> KEY_MINERS_MINERS_INDEX = UniqueKeys0.KEY_MINERS_MINERS_INDEX;
    public static final UniqueKey<MinerDeadlinesRecord> KEY_MINER_DEADLINES_PRIMARY = UniqueKeys0.KEY_MINER_DEADLINES_PRIMARY;
    public static final UniqueKey<MinerDeadlinesRecord> KEY_MINER_DEADLINES_MINER_DEADLINES_INDEX = UniqueKeys0.KEY_MINER_DEADLINES_MINER_DEADLINES_INDEX;
    public static final UniqueKey<PayoutsRecord> KEY_PAYOUTS_PRIMARY = UniqueKeys0.KEY_PAYOUTS_PRIMARY;
    public static final UniqueKey<PayoutsRecord> KEY_PAYOUTS_PAYOUTS_INDEX = UniqueKeys0.KEY_PAYOUTS_PAYOUTS_INDEX;
    public static final UniqueKey<PoolStateRecord> KEY_POOL_STATE_PRIMARY = UniqueKeys0.KEY_POOL_STATE_PRIMARY;
    public static final UniqueKey<PoolStateRecord> KEY_POOL_STATE_POOL_STATE_INDEX = UniqueKeys0.KEY_POOL_STATE_POOL_STATE_INDEX;
    public static final UniqueKey<WonBlocksRecord> KEY_WON_BLOCKS_PRIMARY = UniqueKeys0.KEY_WON_BLOCKS_PRIMARY;
    public static final UniqueKey<WonBlocksRecord> KEY_WON_BLOCKS_WON_BLOCKS_INDEX = UniqueKeys0.KEY_WON_BLOCKS_WON_BLOCKS_INDEX;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<BestSubmissionsRecord, Long> IDENTITY_BEST_SUBMISSIONS = Internal.createIdentity(BestSubmissions.BEST_SUBMISSIONS, BestSubmissions.BEST_SUBMISSIONS.DB_ID);
        public static Identity<MinersRecord, Long> IDENTITY_MINERS = Internal.createIdentity(Miners.MINERS, Miners.MINERS.DB_ID);
        public static Identity<MinerDeadlinesRecord, Long> IDENTITY_MINER_DEADLINES = Internal.createIdentity(MinerDeadlines.MINER_DEADLINES, MinerDeadlines.MINER_DEADLINES.DB_ID);
        public static Identity<PayoutsRecord, Long> IDENTITY_PAYOUTS = Internal.createIdentity(Payouts.PAYOUTS, Payouts.PAYOUTS.DB_ID);
        public static Identity<WonBlocksRecord, Long> IDENTITY_WON_BLOCKS = Internal.createIdentity(WonBlocks.WON_BLOCKS, WonBlocks.WON_BLOCKS.DB_ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<BestSubmissionsRecord> KEY_BEST_SUBMISSIONS_PRIMARY = Internal.createUniqueKey(BestSubmissions.BEST_SUBMISSIONS, "KEY_best_submissions_PRIMARY", BestSubmissions.BEST_SUBMISSIONS.DB_ID);
        public static final UniqueKey<FlywaySchemaHistoryRecord> KEY_FLYWAY_SCHEMA_HISTORY_PRIMARY = Internal.createUniqueKey(FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY, "KEY_flyway_schema_history_PRIMARY", FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.INSTALLED_RANK);
        public static final UniqueKey<MinersRecord> KEY_MINERS_PRIMARY = Internal.createUniqueKey(Miners.MINERS, "KEY_miners_PRIMARY", Miners.MINERS.DB_ID);
        public static final UniqueKey<MinersRecord> KEY_MINERS_MINERS_INDEX = Internal.createUniqueKey(Miners.MINERS, "KEY_miners_miners_index", Miners.MINERS.ACCOUNT_ID);
        public static final UniqueKey<MinerDeadlinesRecord> KEY_MINER_DEADLINES_PRIMARY = Internal.createUniqueKey(MinerDeadlines.MINER_DEADLINES, "KEY_miner_deadlines_PRIMARY", MinerDeadlines.MINER_DEADLINES.DB_ID);
        public static final UniqueKey<MinerDeadlinesRecord> KEY_MINER_DEADLINES_MINER_DEADLINES_INDEX = Internal.createUniqueKey(MinerDeadlines.MINER_DEADLINES, "KEY_miner_deadlines_miner_deadlines_index", MinerDeadlines.MINER_DEADLINES.ACCOUNT_ID, MinerDeadlines.MINER_DEADLINES.HEIGHT);
        public static final UniqueKey<PayoutsRecord> KEY_PAYOUTS_PRIMARY = Internal.createUniqueKey(Payouts.PAYOUTS, "KEY_payouts_PRIMARY", Payouts.PAYOUTS.DB_ID);
        public static final UniqueKey<PayoutsRecord> KEY_PAYOUTS_PAYOUTS_INDEX = Internal.createUniqueKey(Payouts.PAYOUTS, "KEY_payouts_payouts_index", Payouts.PAYOUTS.TRANSACTION_ID);
        public static final UniqueKey<PoolStateRecord> KEY_POOL_STATE_PRIMARY = Internal.createUniqueKey(PoolState.POOL_STATE, "KEY_pool_state_PRIMARY", PoolState.POOL_STATE.KEY);
        public static final UniqueKey<PoolStateRecord> KEY_POOL_STATE_POOL_STATE_INDEX = Internal.createUniqueKey(PoolState.POOL_STATE, "KEY_pool_state_pool_state_index", PoolState.POOL_STATE.KEY);
        public static final UniqueKey<WonBlocksRecord> KEY_WON_BLOCKS_PRIMARY = Internal.createUniqueKey(WonBlocks.WON_BLOCKS, "KEY_won_blocks_PRIMARY", WonBlocks.WON_BLOCKS.DB_ID);
        public static final UniqueKey<WonBlocksRecord> KEY_WON_BLOCKS_WON_BLOCKS_INDEX = Internal.createUniqueKey(WonBlocks.WON_BLOCKS, "KEY_won_blocks_won_blocks_index", WonBlocks.WON_BLOCKS.BLOCK_HEIGHT, WonBlocks.WON_BLOCKS.BLOCK_ID);
    }
}
